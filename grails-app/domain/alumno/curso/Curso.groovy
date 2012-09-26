package alumno.curso

class Curso {

    String codigoCurso
	String nombre
	String programa
	String duraccion
	Date fechaInicio
	Date fechaFin

	static hasMany =[alumnos:Alumno]

    static constraints = {
    	codigoCurso blank:false, size: 4..6
    	nombre blank:false
    	programa widget:'textarea', blank: false
    	fechaInicio blank:false
    	fechaFin blank:false
    	alumnos box:true
    }
}
