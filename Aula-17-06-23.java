/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.mavenproject1;

import java.util.Scanner;

public class NewClass 
{
    public static double[] notas = new double[4];
    public static int notasAlunos = 0;
    public static double media = 0;
    
    public static void insiriNotas()
    {
        Scanner teclado = new Scanner(System.in);
        
        boolean laco = true;
        
        while(laco && notasAlunos < notas.length)
        {
            for (int i = 0; i < notas.length; i++) 
            {
                System.out.println("|--------------------------------------------|");
                System.out.println("|Insira a " + (i+1) + "°" + " notas do aluno |");
                System.out.println("|--------------------------------------------|");

                notas[notasAlunos] =  teclado.nextInt();
                notasAlunos++;
            }
        }
    }
    
    public static void exibirNotas(double[] notas) 
    {
        for (int i = 0; i < notas.length; i++)
        {
            System.out.println("|A " + (i+1) + "°" + " nota e " + notas[i] + "|");
        }
    }
    
    public static void calculaMedia(double[] notas) 
    {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) 
        {
            soma += notas[i];
        }
        media = (double) soma / notas.length;
        System.out.println("|---------------------------------------------|");
        System.out.println("|A média do Aluno é: " + media + "            |");
        
        
        
    }
    
    public static void verificaSituacao(double media) 
    {
        if(media <= 5.9)
        {
            System.out.println("|---------------------------------------------|");
            System.out.println("|Aluno Reprovado                               |");
            System.out.println("|---------------------------------------------|");
        }
        if(media >= 6.0)
        {
            System.out.println("|---------------------------------------------|");
            System.out.println("|Aluno Aprovado                             |");
            System.out.println("|---------------------------------------------|");
        }
    }
    
    public static void main(String[] args) 
    {
        insiriNotas();
        exibirNotas(notas);
        calculaMedia(notas);
        verificaSituacao(media);
        System.exit(0);
    }
}
