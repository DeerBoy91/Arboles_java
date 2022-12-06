/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_java;

/**
 *
 * @author vikhu
 */
public class clase_arbol {
    
   
    //nodos iniciales
    clase_arbol nodoizq;
    int datos;
    clase_arbol nododer;
    
    //inicia y asigna el nodo como un hijo
    public clase_arbol(int datosNodo)
    {
        datos = datosNodo;
        nodoizq = nododer = null; //el nodo no tiene hijos
    }
    
    //insertar un nodo nuevo
    public synchronized void insertar(int valorInsertar)
    {
        //insertar en el subarbol izquierdo
        if(valorInsertar < datos)
        {
            //insertar en subarbol izquierdo
            if(nodoizq == null)
                nodoizq = new clase_arbol(valorInsertar);
            else    //continua recorriendo subarbol izquierdo
                nodoizq.insertar(valorInsertar);
        }
        
        //insertar el nodo derecho
        else if(valorInsertar > datos)
        {
            //insertar nuevo nodoArbol
            if(nododer == null)
                nododer = new clase_arbol(valorInsertar);
            else
                nododer.insertar(valorInsertar);
        }
    } 
}

class Arbol
{
    private clase_arbol raiz;
    
    //construir un arbol vacio
    public Arbol()
    {
        raiz = null;
    }
    
    //insertar un nuevo ndo en el arbol de busqueda binaria
    public synchronized void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new clase_arbol(valorInsertar); //crea nodo raiz
        else
            raiz.insertar(valorInsertar); //llama al metodo insertar        
    }
    
    // recorrido preorden
    public synchronized void recorridoPreorden()
    {
        auxPreorden(raiz);
    }
   
    private void auxPreorden(clase_arbol nodo) //recorrido preorden
    {
        if(nodo == null)
            return;
        
        System.out.print(nodo.datos + " ");//mostrar datos
        auxPreorden(nodo.nodoizq);//recorrer subarbol izquierdo
        auxPreorden(nodo.nododer);//recorrer subarbol derecho
    }
    
    //recorrido inorden
    public synchronized void recorridoInorden()
    {
        auxInorden(raiz);
    }
    
    //meoto recursivo para recorrido inorden
    private void auxInorden( clase_arbol nodo)
    {
        if(nodo == null)
            return;
        
        auxInorden(nodo.nodoizq);
        System.out.print(nodo.datos + " ");
        auxInorden(nodo.nododer);
    }
    
    //EMPEZAR RECORRIDO PORORDEN
    public synchronized void recorridoPosorden()
    {
        auxPosorden(raiz);        
    }
    
    //meotod recursivo para recorrido posorden
    private void auxPosorden(clase_arbol nodo)
    {
        if( nodo == null )
            return;
        
        auxPosorden(nodo.nodoizq);
        auxPosorden(nodo.nododer);
        System.out.print(nodo.datos + " ");  
}
}
