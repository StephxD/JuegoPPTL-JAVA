/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author soviedog
 */
public class Juego {

    private final Random RD = new Random();
    private int ganaPlayer = 0;
    private int ganaComputer = 0;

   
    public int turnoMaquina() {
        return RD.nextInt(4);
    }

    
    public String versus(int valorUsuario, int valorMaquina) {
      
        if (valorMaquina == valorUsuario) {
         
            return "- Empate  -";
        } else {
         
            switch (valorMaquina) {
                case 0: {
                    if (valorUsuario == 1) {
                        return "Gana jugador 1";
                    }
                }
                break;
                case 1: {
                    if (valorUsuario == 2 || valorUsuario == 3) {
                        return "Gana jugador 1";
                    }
                }
                break;
                case 2: {
                    if (valorUsuario == 0) {
                        return "Gana jugador 1";
                    }
                }
                break;
                case 3: {
                    if (valorUsuario == 2 || valorUsuario == 0) {
                        return "Gana jugador 1";
                    }

                }
                break;
            }
        }
       
        return "Gana Computadora";
    }

    public ImageIcon traductorTurnero(int val) {
        String resImg = "";
        switch (val) {
            case 0: {
                resImg = "/Imagenes/piedra.png";
            }
            break;
            case 1: {
                resImg = "/Imagenes/papel.png";
            }
            break;
            case 2: {
                resImg = "/Imagenes/tijeras.png";
            }
            break;
            case 3: {
                resImg = "/Imagenes/lagarto.png";
            }
            break;
        }
        ImageIcon imgCon = new ImageIcon(getClass().getResource(resImg));
        ImageIcon imgJlb = new ImageIcon(imgCon.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        return imgJlb;
    }

    public void contadorDeVictorias(String valor) {
        switch (valor) {
            case "Gana jugador 1": {
                ganaPlayer++;
            }
            break;
            case "Gana Computadora": {
                ganaComputer++;
            }
            break;
        }
    }

    public int getGanaPlayer() {
        return ganaPlayer;
    }

    public int getGanaComputer() {
        return ganaComputer;
    }

}
