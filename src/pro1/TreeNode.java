/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1;

import model.Partido;

/**
 *
 * @author alumno
 */
public class TreeNode {

    
     public int key=0;
    public Partido partido;
    public BinaryTree Left, Right;

    // Constructors
     public TreeNode() {
        this.key = 0;
        this.partido = null;
        this.Left = null;
        this.Right = null;
    }
    public TreeNode(int key,Partido partido) {
        this.key=key;
       this.partido = partido;
        this.Left = null;
        this.Right = null;
    }

   
}
