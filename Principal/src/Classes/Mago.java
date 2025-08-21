package Classes;

import java.util.Random;

//Boa sorte!
public class Mago extends Personagem {
    private static final Random random = new Random();

    public Mago() {
        super("Merlim", "Maga", "Bola de fogo");
        setVida(100);
        setEnergia(80);
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

        if (c.equals("barbaro") || c.equals("druida")) {
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
            System.out.println(" acertou! " + getNome() + " atira um disparo flamejante contra  " + inimigo.getNome()
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
        int dano = 25;
        int custoEnergia = 25;
        if (getEnergia() >= custoEnergia) {
            System.out.println(getNome() + " aponta o centro atira uma bola de fogo em " + inimigo.getNome()
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