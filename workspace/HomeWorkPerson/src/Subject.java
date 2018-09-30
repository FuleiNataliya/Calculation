

public enum Subject {
	MATHEMATICS, PHYSICS, HISTORY, MUSIC, CHEMISTRY;
	public static Subject getSubject(String name){
	Subject[] values = 	values();
	for (Subject s: values){
		if (s.name().toLowerCase().equals(name)){
			return s;
		}
	
	}
	return null;
	}
}



