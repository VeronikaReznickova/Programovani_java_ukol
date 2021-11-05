package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka;
    public void main(String[] args) {


        zofka = new Turtle();
//        nakresliTrojuhelnik();
//        nakresliCtverec();
//        nakresliObdelnik();
//        nakresliKolecko();
//        vypocitejTretiStranu(300,80);
//        nakresliTrojuhelnikPara(132, 170, 46);
//        nakresliCtverecPara(200);
//        nakresliObdelnikPara(300, 245);
//        nakresliKoleckoPara(200);
//        nakresliZmrlinu();
//        nakresliSnehulakaJednimTahem();
//        nakresliSnehulaka();
//        nakresliVlak();
        nakresliUkol();

        double stranaC;
        double velikostRamene = 250;
        double uhelMeziRameny = 46;
        stranaC = vypocitejTretiStranu(velikostRamene, uhelMeziRameny);
        System.out.println("Strana A je " + velikostRamene + ", strana B je " +
                               + velikostRamene + " a uhel mezi nimi je " + uhelMeziRameny + "°");
        System.out.println("Pak je strana C dlouha " + stranaC);

    }
    //část 1 - nakresli Rovnoramenný trojúhelník, čtverec, obdelník a kolečk (s pevnými velikostmi stran)
    public void nakresliTrojuhelnik () {
        zofka.turnRight(20);
        zofka.move(250);
        zofka.turnRight(140);
        zofka.move(250);
        zofka.turnRight(110);
        zofka.move(170);
        zofka.turnRight(90);
    }

    public void nakresliCtverec () {
        for (int i = 0; i < 4; i++) {
            zofka.move(200);
            zofka.turnLeft(90);
        }
    }

    public void nakresliObdelnik () {
        for (int i = 0; i < 2; i++) {
            zofka.move(200);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }
    public void nakresliKolecko () {
        for (int i = 0; i < 36; i++) {
            zofka.move(40);
            zofka.turnLeft(10);
        }
    }

    // část 2 - parametrizované metody na kreslení rovnoramenného trojuhelníku, čtverce, obdelníku a kolečka.
    // Metody by měly přijímat jako vstupní parametr velikost strany (typu double).
    // V případě trojúhelníku ještě úhel mezi rameny.
    // V případě obdelníku budou nutné dva parametry (strana A, strana B).
    // V případě kolečka se bude předávat velikost kolečka (zda to bude poloměr, průměr nebo nějaká
    // jiná charakteristika, nechám na vás).


    public void nakresliTrojuhelnikPara (double stranaC, double velikostRamene, double uhelMeziRameny) {
        double uhelA = (180 - uhelMeziRameny)/2;
        zofka.turnRight(90);
        zofka.move(stranaC);
        zofka.turnRight(180 - uhelA);
        zofka.move(velikostRamene);
        zofka.turnRight(180-uhelMeziRameny);
        zofka.move(velikostRamene);
        zofka.turnRight(180 - uhelA);
    }

    public double vypocitejTretiStranu(double velikostRamene, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((velikostRamene
                * Math.sin((uhelMeziRameny * Math.PI / 180.0) / 2.0)) * 2.0);
        return (int) tretiStrana;
    }

    public void nakresliCtverecPara(double delkaStrany) {

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
        }
    }
    public void nakresliObdelnikPara(double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnLeft(90);
            zofka.move(delkaStranyB);
            zofka.turnLeft(90);
        }
    }
    public void nakresliKoleckoPara (double prumer) {
        double obvodKolecka = 3.1415 * prumer;
        for (int i = 0; i < 36; i++) {
            zofka.move(obvodKolecka / 36);
            zofka.turnLeft(10);
        }
    }
    public void nakresliSnehulakaJednimTahem () {
        zofka.setLocation(650, 600);
        for (int i = 0; i < 45; i++) {
            zofka.move(20);
            zofka.turnLeft(10);
        }
        zofka.turnRight(180);
        for (int i = 0; i < 54; i++) {
            zofka.move(15);
            zofka.turnLeft(10);
        }
        zofka.turnRight(180);
        for (int i = 0; i < 36; i++) {
            zofka.move(10);
            zofka.turnLeft(10);
        }
        zofka.turnRight(180);
        for (int i = 0; i < 9; i++) {
            zofka.move(15);
            zofka.turnLeft(10);
        }
        zofka.turnRight(180);
        for (int i = 0; i < 36; i++) {
            zofka.move(5);
            zofka.turnLeft(10);
        }
        zofka.turnRight(180);
        for (int i = 0; i < 18; i++) {
            zofka.move(15);
            zofka.turnLeft(10);
        }
        zofka.turnRight(180);
        for (int i = 0; i < 36; i++) {
            zofka.move(5);
            zofka.turnLeft(10);
        }
        zofka.turnRight(180);
    }
    public void nakresliSnehulaka () {
        zofka.setLocation(650, 600);
        nakresliKoleckoPara(230);
        zofka.setLocation(620,400);
        nakresliKoleckoPara(170);
        zofka.setLocation(590,260);
        nakresliKoleckoPara(110);
        zofka.setLocation(675,400);
        nakresliKoleckoPara(55);
        zofka.setLocation(450,400);
        nakresliKoleckoPara(55);
    }

    public void nakresliZmrlinu () {
        zofka.setLocation(135, 385);
        this.nakresliTrojuhelnikPara(195, 250, 46);
        zofka.setLocation(225, 435);
        this.nakresliKoleckoPara(215);
        zofka.turnLeft(90);
    }
    public void nakresliVlak () {
        zofka.setLocation(900, 600);
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(141);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.penUp();
        zofka.move(220);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.penDown();
        this.nakresliObdelnikPara(120, 220);
        zofka.turnRight(90);
        this.nakresliObdelnikPara(150, 240);
        zofka.turnRight(90);
        this.nakresliKoleckoPara(150);
        zofka.turnRight(90);
        zofka.move(50);
        this.nakresliKoleckoPara(70);
        zofka.move(100);
        this.nakresliKoleckoPara(70);
        zofka.turnRight(90);

    }
    public void nakresliUkol () {
        this.nakresliZmrlinu();
        this.nakresliSnehulaka();
        this.nakresliVlak();
    }
}
