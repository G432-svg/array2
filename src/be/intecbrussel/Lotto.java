package be.intecbrussel;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Lotto {
    
//    public class Trek {
//        private String name = "Trek anonymous";
//        private ArrayList<Integer> trek = new ArrayList<Integer>();
//
//
//        // CONSTRUCTOR 1
//        public Trek() {
//            // Par default, make we een trekking van 6 numbers
//            NewTrek();
//        }
//
//        private void NewTrek() {
//        }
//
//
//        // CONSTRUCTOR 2
//        public Trek(boolean manuel) {
//            // Manuel input van numbers
//            if (manuel) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Entre 6  different numbers entre 1 and 45 :");
//            }
//
//                for (int i = 0; i < 5; i++) {
//                    int number;
//                    do {
//                        number = sc.nextInt();
//
//                        if (Exist(number))
//                            System.out.println("You have already entered this number");
//                        else if (number < 1)
//                            System.out.println("Number to small");
//                        else if (number > 49)
//                            System.out.println("Number to large");
//                    } while ((Exist(number)) || (number < 1) || (number > 45));
//
//                    trek.add(number);
//                }

//                System.out.println("Entrez un numéro complémentaire entre 1 et 10 :");
//                int number;
//                do {
//                    number = sc.nextInt();
//
//                    if(Existe(number))
//                        System.out.println("You have already entered this number");
//                    else if(number<1)
//                        System.out.println("Number to small");
//                    else if(number>10)
//                        System.out.println("Number to large");
//                } while ((Existe(number)) || (number<1) || (number>10));
//                trek.add(number);
//            }
//
//            // Par défaut, on crée une tirage de 5 numéros + 1 complémentaire
//            else
//                NouveauTirage();
////        }
//
//
//        // CONSTRUCTOR 3 (parameters : size van trek)
//        public Trek(int size) {
//            NewTrek(size);
//        }
//
//
//        // CONSTRUCTOR 4 (parameters : size van trek, name)
//        public Trek(int size, String name) {
//            this.name = name;
//            NewTrek(size);
//        }
//
//
//        public String getName() {
//            return this.name;
//        }
//
//
//        // Affiche contenu de tirage
//        public void Afficher() {
//            for (int i = 0; i < tirage.size()-1; i++) // Affiche la série de numéros AVANT le complémentaire
//                if (tirage.get(i) < 10)
//                    System.out.print(tirage.get(i)+"   ");
//                else
//                    System.out.print(tirage.get(i)+"  ");
//
//            System.out.println("("+tirage.get(tirage.size()-1)+")"); // Affiche le numéro complémentaire
//        }
//
//
//        // Indique si valeur existe déjà dans la tirage
//        public boolean Existe(int valeur) {
////		return this.tirage.contains(valeur);
//
//            for (int elem : this.tirage)
//                if (elem == valeur) return true;
//
//            return false;
//        }
//
//
//           // Tire une série de numéros (TAILLE PAR DEFAUT = 5)
//          public void TirageSerie() {
//            Random rnd = new Random(); // retourne une valeur comprise entre [0;1]
//
//            for (int i=0; i<5; i++) {
//                int tirage;
//
//                // continue de tirer de nouveaux numéros tant que tirage est déjà compris dans tirage
//                do {
//                    tirage = rnd.nextInt(49)+1; // tire un numéro entre [1;49]
//                } while (Existe(tirage));
//
//                this.tirage.add(tirage);
//            }
//        }
//
//            // Tire un numéro complémentaire absent de la tirage
//
//            // Tire une série de numéros (TAILLE DE SERIE EN PARAMETRE)
//            public void TirageSerie(int taille) {
//            if (taille < 1)
//                throw new java.lang.Error("\n\n\tTaille trop petite, demandez au moins 2 valeurs\n");
//
//            Random rnd = new Random(); // retourne une valeur comprise entre [0;1]
//
//            for (int i=0; i<taille; i++) {
//                int tirage;
//
//                // continue de tirer de nouveaux numéros tant que tirage est déjà compris dans tirage
//                do {
//                    tirage = rnd.nextInt(48)+1; // tire un numéro entre [1;48]
//                } while (Existe(tirage));
//
//                this.tirage.add(tirage);
//            }
//        }
//
//
////         public void TirageComplementaire() {
//            Random rnd = new Random(); // retourne une valeur comprise entre [0;1]
//
//            int complementaire;
//            do {
//                complementaire = rnd.nextInt(10)+1; // tire un number entre [1;10]
//            } while (Existe(complementaire));
//
//            tirage.add(complementaire);
////        }
//
//
//        // On réinitialise la tirage avec de nouvelles valeurs
//        public void NouveauTirage() {
//            tirage.clear(); // on vide le tirage au cas où elle contenait déjà des valeurs
//            TirageSerie();
//            TirageComplementaire();
//        }
//
//
//        // On réinitialise la tirage (TAILLE DE SERIE EN PARAMETRE)
//        public void NouveauTirage(int taille) {
//            tirage.clear(); // on vide le tirage au cas où elle contenait déjà des valeurs
//            TirageSerie(taille-1);
//            TirageComplementaire();
//        }
//
//    }
//
            }

//       private boolean Existe(int number){
//
//            }}