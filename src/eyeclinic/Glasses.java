/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeclinic;

public class Glasses implements FrameStatus{
    
    private String FrameShape;
    private String rightEye;
    private String leftEye;
   private String Availablity;

   
    public Glasses() {
    }

    public String getFrameShape() {
        return FrameShape;
    }

    public void setFrameShape(String FrameShape) {
        this.FrameShape = FrameShape;
    }

    public String getRightEye() {
        return rightEye;
    }

    public void setRightEye(String rightEye) {
        this.rightEye = rightEye;
    }

    public String getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(String leftEye) {
        this.leftEye = leftEye;
    }

   

    @Override
    public void on() {
        System.out.println("Frame is Available");   
    }

    @Override
    public void off() {
    
        System.out.println("Frame is not Available");
    }
    
    
}
