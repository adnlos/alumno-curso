package alumno.curso

class Alumno {

	String matricula
	String nombre
	String apellidos
	String email
	String direccion

	static belongsTo=[curso:Curso] 
 

    static constraints = {
    	matricula blank:false, size:4..6
    	nombre blank:false
    	apellidos blank:false
    	email email:true, blank:false
    }
}
