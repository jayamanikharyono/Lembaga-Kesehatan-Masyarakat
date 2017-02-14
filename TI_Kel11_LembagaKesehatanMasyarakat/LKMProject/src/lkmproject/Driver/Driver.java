/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.Driver;

/**
 *
 * @author Jayuk
 */
public class Driver 
{
    public static void main(String[] args) 
    {
        DokterAppRun run1 = new DokterAppRun(args);
        PetugasAppRun run2 = new PetugasAppRun(args);
        Thread thread1 = new Thread(run1);
        Thread thread2 =  new Thread(run2);
    }
}
