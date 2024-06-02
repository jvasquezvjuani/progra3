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
public class BinaryTree {
   
    // Attribute
    public TreeNode Root;

    // Constructor
    public BinaryTree() {
        this.Root = null;
    }

    // Methods
    public Boolean IsNew() {
        return (Root == null);
    }

    public void Add(int key,Partido partido) {
        if (IsNew()) {
            var newNode = new TreeNode(key,partido);
            newNode.Left = new BinaryTree();
            newNode.Right = new BinaryTree();
            Root = newNode;
        } else {
            if (key < Root.key) {
                Root.Left.Add(key,partido);
            } else if (key> Root.key) {
                Root.Right.Add(key,partido);
            } else {
                System.err.println("Error: Dato '" + key + "' ya existe.");
            }
        }
    }

    // PreOrder R-I-D
    public void PreOrder() {
        if (!IsNew()) {
            System.out.print(Root.key + " | "+Root.partido.EquipoLocal);
            Root.Left.PreOrder();
            Root.Right.PreOrder();
        }
    }

    
}
