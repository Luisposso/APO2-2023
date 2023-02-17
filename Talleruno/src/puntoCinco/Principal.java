package puntoCinco;

import puntoSiete.Person;

public class Principal {

	//Metodos
	public static void main(String[] args) {
		
		
		//crear un objeto de tipo Student con la siguiente sintaxis 
		//primero coloco el tipo de dato del objeto, despues el nombre del objeto, luego el signo igual, depues la palabra new y por ultimo el constructor de la clase 
   
	    Student st = new Student();
	    System.out.println(st.name + "\n" + st.id + "\n" + st.status);
	    puntoSiete();
	}
	
	


    public static void puntoSiete (){
    	
    	Person p1 = new Person(37,"arial");
    	Person p2 = new Person(15,"Joaeph");
    	
    	if(p1.getAge() == p2.getAge()) {
    		
    		System.out.println(p1.getName() +"tiene el mismo nombre que " + p2.getName());
    		
    	}
    	else {
    		System.out.println(p1.getName() +"No tiene el mismo nombre que " + p2.getName());
    	}
    	

    }
}
    