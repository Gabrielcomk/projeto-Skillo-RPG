package Classes;

import java.text.DecimalFormat;
import java.util.Random;

//Boa sorte!
public class Ladino extends Personagem {
    private static final Random random = new Random();
    DecimalFormat df = new DecimalFormat("0.000");

    public Ladino() {
        super("Ankhler", "Ladino", "Saraivada");
        setVida(100);
        setEnergia(25);
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

        if (c.equals("mago") || c.equals("arqueiro")) {
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
            System.out.println(" acertou! " + getNome() + " realiza uma facada contra " + inimigo.getNome()
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
        int dano = 15;
        int danoTotal = 0;
        int custoEnergia = 10;
        int i = 1;
        int acertos = 0;
        int rolagemEsp;
        if (getEnergia() >= custoEnergia) {
            setEnergia(getEnergia() - custoEnergia);
            System.out.print(getNome() + " se posiciona e realiza uma saraivada de cortes contra " + inimigo.getNome()
                    + ", fatiando sem parar, por um total de ");
            do{
                rolagemEsp = random.nextInt(10) + 1;
                if (rolagemEsp > inimigo.getDefesa()){
                    i++;
                    acertos++;
                    danoTotal += dano;
                    dano -= 5;
                } else{
                    i++;
                }
            } while (i < 3);
            inimigo.setVida(inimigo.getVida() - danoTotal);
            System.out.println(i + " cortes, " + acertos + " acertos e " + danoTotal + " de dano total! (max 3 cortes)");
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }
        } else {
            System.out.println(getNome() + " não tem energia suficiente para o golpe especial!");
        }
    }
}