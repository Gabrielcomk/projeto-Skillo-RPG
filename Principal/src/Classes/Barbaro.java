package Classes;

import java.util.Random;

public class Barbaro extends Personagem {
    private static final Random random = new Random();

    public Barbaro() {
        super("Ragnar", "Bárbaro", "Golpe Furioso");
        setVida(100);
        setEnergia(18);
        setDefesa(4);
    }

    private static String norm(String s) {
        if (s == null) return "";
        return java.text.Normalizer.normalize(s, java.text.Normalizer.Form.NFD)
                .trim()
                .toLowerCase();
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = 10;
        String c = norm(inimigo.getClasse());

        int rolagem = random.nextInt(10) + 1;

        System.out.print(getNome() + " ataca! Dado rolado para o acerto... " + rolagem + ", ");

        if (c.equals("ladino") || c.equals("arqueiro")) {
            dano = (int) (dano + (dano * 0.2));

            if (rolagem > 8) {
                System.out.print("crítico, e ");
                dano += (int) ((dano * getCritico()));
            }
        }

        else {
            if (rolagem > 8) {
                System.out.print("crítico, e ");
                dano += (int) ((dano * getCritico()));
            }
        }

        if (rolagem >= inimigo.getDefesa()) {
            System.out.println(" acertou! " + getNome() + " realiza uma machadada contra " + inimigo.getNome()
                    + ", causando " + dano + " de dano! ");
            inimigo.setVida(inimigo.getVida() - dano);
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }
        }

        else {
            System.out.println(getNome() + " errou!");
        }
    }

    @Override
    public void ataqueEspecial(Personagem inimigo) {
        int dano = 12;
        int custoEnergia = 6;
        if (getEnergia() >= custoEnergia) {
            System.out.println(getNome() + " entra em fúria e golpeia " + inimigo.getNome()
                    + ", causando " + dano + " de dano!");
            inimigo.setVida(inimigo.getVida() - dano);
            setEnergia(getEnergia() - custoEnergia);
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }
        } else {
            System.out.println(getNome() + " não tem energia suficiente para o golpe especial!");
        }
    }
}