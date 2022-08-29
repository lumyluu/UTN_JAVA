package capitulo2.institute;

import java.util.Arrays;
import java.util.Scanner;

public class InstituteTest {
    public static void main ( String [] args){
        Scanner scanner = new Scanner( System.in);
        String option = "";

        Institute institute = new Institute();
        institute.setInstituteName("Don Bosco");

        Professor [] professors = new Professor[5];
        institute.setProfessorList(professors);

        Student [] students = new Student[5];
        institute.setStudentList(students);

        Classroom[] classrooms = new Classroom[5];
        institute.setClassrooms(classrooms);
        Course [] courses = new Course[5];
        Course course1 = new Course("AI");
        Course course2 = new Course("Data Science");
        Course course3 = new Course("Creative writing ");
        Course course4 = new Course("UX");
        Course course5 = new Course("UI");
        courses[0] = course1;
        courses[1] = course2;
        courses[2] = course3;
        courses[3] = course4;
        courses[4] = course5;
        institute.setCourses(courses);


        while (!"0".equals(option)){
            System.out.println( "Choose an option: ");

            System.out.println( " 0. to exit");
            System.out.println( " 1. Alta profesor");
            System.out.println( " 2. Alta estudiante");
            System.out.println( " 3. Cerrar cursada");
            System.out.println( " 4. Listar materias");
            System.out.println( " 5. Mostrar instituto");


            option = scanner.next();

            switch (option) {
                case "1":
                   altaProfesor (institute, scanner);
                    break;
                case "2":
                    altaEstudiante (institute, scanner);
                    break;
                case "3":
                    cerrarCursada (institute,scanner);
                    break;
                case "4":
                    listarCursos(institute,scanner);
                    break;
                case "5":
                    mostrarInstituto (institute,scanner);
                    break;
                default:
                    System.out.println( "please select a valid option");

            }
        }

    }

    private static void mostrarInstituto(Institute institute, Scanner scanner) {
        System.out.println(institute);
    }

    private static void listarCursos(Institute institute, Scanner scanner) {
        System.out.println(Arrays.toString(institute.getCourses()));
    }

    private static void cerrarCursada(Institute institute, Scanner scanner) {
    }

    private static void altaEstudiante(Institute institute, Scanner scanner) {
    }

    private static void altaProfesor(Institute institute, Scanner scanner) {
        Professor professor = new Professor();
        System.out.println( " Ingrese su nombre");
        professor.setName(scanner.next());

        System.out.println( " Ingrese su apellido ");
        professor.setLastName(scanner.next());

        System.out.println( " Ingrese su dni");
        professor.setIdentityCard(scanner.next());

        System.out.println( " Ingrese su email");
        professor.setEmail(scanner.next());

        institute.setProfessor(professor);

    }

   // asignar un curso a un profesor
    //
    }

