
public class HomeWorkPerson {
	
		class Person {
			private int age;
			private String name;
			public Person (int age, String name){
			this.setAge(age);
			this.setName(name); {
                }
			}

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
		class Teacher extends Person {
			private String subject;
			public Teacher(int age, String name, String subject){
				super(age,name);
				this.subject = subject;
                System.out.println("35, Teodor, history and chemistry");
                System.out.println("42, OLeg, mathematics and physics");
			}
		}
		class Student extends Person {
			private String subject;
			public Student(int age, String name, String subject){
				super(age,name);
				this.subject = subject;
                System.out.println("18, Olga, history and chemistry");
                System.out.println("19, Orest, mathematics and physics");
			}

		}
	}

