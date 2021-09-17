/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeclinic;

import java.util.Scanner;


public class EyeClinic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        Scanner ic = new Scanner(System.in);
       
        Scanner ac = new Scanner(System.in);
        
        System.out.println("Welcome To Eye Clinic");
        System.out.println("-->");
        System.out.println("Enter Patient Information:");
        
        System.out.println("-->");
        
        Patient patient = new Patient();
        
        System.out.println("Enter ID:");
        int id = ic.nextInt();
        
        patient.setId(id);
        
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        patient.setName(name);
        
        System.out.println("Enter Email Address:");
        String email = sc.nextLine();
        patient.setEmail(email);
        
        System.out.println("-->");
        
        System.out.println("Now Please Enter about Eyeside:");
        
        System.out.println("-->");
        
        Glasses glass = new Glasses();
        
        System.out.println("Right Eyeside:");
        String right = ac.nextLine();
        
        glass.setRightEye(right);
        
        System.out.println("Left Eyeside:");
        String left = ac.nextLine();
        
        glass.setLeftEye(left);
        
        System.out.println("-->");
        
        System.out.println("Select Frame:");
       
        String frames[]={"Circle","Oval","Square","Hexagon"};
        
        for(int i=0; i<frames.length; i++){
            
            System.out.println(frames[i]);
            System.out.println("");
        }
        
        System.out.println("-->");
        
        System.out.println("Enter Shape");
        String shape = sc.nextLine();
        glass.setFrameShape(shape);
        
        glass.on();
        
        System.out.println("-->");
        
        System.out.println("Information You Entered is:");
        
        System.out.println("Name: "+patient.getName());
        System.out.println("Email: "+patient.getEmail());
        
        
        System.out.println("EyeSide");
        System.out.println("Right Eye: "+glass.getRightEye());
        System.out.println("Left Eye: "+glass.getLeftEye());
        System.out.println("Frame Shape: "+glass.getFrameShape());
        glass.on();

        
        
        
    
    }
    
}
