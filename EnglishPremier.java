
package english.premier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
//Batool Shaderma
public class EnglishPremier {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
      File file_csv = new File("matches results (1).csv");
        Scanner scan = new Scanner(file_csv);
        
        String information;
        String[] arr;
        int maxPoints = 0;
        String champion = ""; 
        
        scan.nextLine();
        while (scan.hasNext()) {
            information = scan.nextLine();
            arr = information.split(";");
            int Wins = Integer.parseInt(arr[1]);
            int Draws = Integer.parseInt(arr[2]);
            int Num_of_wins = Wins *  3 + Draws;
            if (Num_of_wins > maxPoints) {
                maxPoints = Num_of_wins;
                champion = arr[0];
            }
        } 
        System.out.println("The league champion is: " + champion);
        
        //////////////////////////////////////////////////////////////
        
        String information2;
        String[] arr2 ;
        int Max_num_of_goals = 0;
        String team = " ";
        scan = new Scanner(file_csv);  
        scan.nextLine();
        while (scan.hasNext()) {
            information2 = scan.nextLine();
            arr2 = information2.split(";");
            int num_goals = Integer.parseInt(arr2[5]);
            if (num_goals > Max_num_of_goals) {
                Max_num_of_goals = num_goals;
                team = arr2[0];
            }
        }
        System.out.println("The name of the team that has conceded the highest number of goals: " + team);
        
        //////////////////////////////////////////////////////////////////////////////// 
        
        String[] arr3 ;
        String information3;
        scan = new Scanner(file_csv); 
        scan.nextLine();
        System.out.println("Teams have won more matches than they have lost:");
        while (scan.hasNext()) {
            information3 = scan.nextLine();
            arr3 = information3.split(";");
            int won = Integer.parseInt(arr3[1]);
            int lost = Integer.parseInt(arr3[3]);
            if (won > lost) {
                System.out.println(arr3[0]);
            }
        }
        
        //////////////////////////////////////////////
        
        scan = new Scanner(file_csv); 
        File f = new File("team_points.txt");
        f.createNewFile();
        PrintWriter pw = new PrintWriter(f);
        scan.nextLine();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] a = line.split(";");
            int Wins = Integer.parseInt(a[1]);
            int Draws = Integer.parseInt(a[2]);
            int Num_of_wins = Wins * 3 + Draws;
            pw.printf("%-20s %d%n", a[0], Num_of_wins);
        }
        
        scan.close();
        pw.close();
    }
}