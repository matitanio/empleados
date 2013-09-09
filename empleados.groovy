class Employee {
	def name, salary
	boolean manager
	String toString() { return name }
}

def emps = [new Employee(name:'Guillaume', manager:true, salary:200),
	new Employee(name:'Graeme', manager:true, salary:200),
	new Employee(name:'Dierk', manager:false, salary:151),
	new Employee(name:'Bernd', manager:false, salary:50)]