public class App {
    public static void main(String[] args) throws Exception {
        try{
            Veterinaria clinicaVeterinaria = new Veterinaria("Cuidamos tu mascota");
        System.out.println("Admitiendo Doctores----");
        clinicaVeterinaria.agregarDoctor(new Doctor("Dr. Doolittle"));
        clinicaVeterinaria.agregarDoctor(new Doctor("Dr. Adams"));
        clinicaVeterinaria.agregarDoctor(new Doctor("Dr. House"));
        clinicaVeterinaria.agregarDoctor(new Doctor("Dr. Grey"));
        clinicaVeterinaria.agregarDoctor(new Doctor("Dr. Strange"));

        System.out.println("Admitiendo Mascotas----");
        clinicaVeterinaria.admitirMascota(new Perro("Mushu", Tipo.PERRO,"Mestizo","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Mushu"), "Comio mucho", "Omeprazol");

        clinicaVeterinaria.admitirMascota(new Perro("Scooby Doo", Tipo.PERRO,"Perro Grande","Comio muchas ScoobyGalletas"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Scooby Doo"), "Comio mucho", "Omeprazol");

        clinicaVeterinaria.admitirMascota(new Gato("Garfield", Tipo.GATO,"Gordo","Comio mucha lasagna"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Garfield"), "Comio mucho", "Omeprazol");

        clinicaVeterinaria.admitirMascota(new Perro("Cookie", Tipo.PERRO,"Labrador","Dolor de ojo"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Cookie"), "Alergia", "medicamento");

        clinicaVeterinaria.admitirMascota(new Perro("Marley", Tipo.PERRO,"Golden Retriever","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Marley"), "Desparasitacion", "medicamento");
        
        clinicaVeterinaria.admitirMascota(new Perro("Reina", Tipo.PERRO,"Puddle","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Reina"), "Comio mucho", "medicamento");

        clinicaVeterinaria.admitirMascota(new Conejo("Bugs Bunny", Tipo.CONEJO,"Conejo","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Bugs Bunny"), "Comio mucha zanahoria", "medicamento");

        clinicaVeterinaria.admitirMascota(new Gato("Felix", Tipo.GATO,"Gato","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Felix"), "Desparasitacion", "medicamento");

        clinicaVeterinaria.admitirMascota(new Perro("Blanco", Tipo.CONEJO,"Conejito","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Blanco"), "Comio mucha zanahoria", "medicamento");

        clinicaVeterinaria.admitirMascota(new Gato("Negro", Tipo.GATO,"Negro","Da mala Suerte"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Negro"), "Supersticion", "Placebo");

        clinicaVeterinaria.admitirMascota(new Perro("Beethoven", Tipo.PERRO,"Gran DAnes","Depresion"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Beethoven"), "Soledad", "Lorazepam");

        clinicaVeterinaria.admitirMascota(new Perro("Lucky", Tipo.PERRO,"Perro","Da mucha suerte"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Lucky"), "Supersticion", "Placebo");

        clinicaVeterinaria.admitirMascota(new Conejo("Lola Bunny", Tipo.CONEJO,"Conejita","Depresion"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Lola Bunny"), "Desparasitacion", "medicamento");

        clinicaVeterinaria.admitirMascota(new Conejo("Jessica Rabbit", Tipo.CONEJO,"Perro","Fatiga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Jessica Rabbit"), "Exceso de trabajo", "Vacaciones");

        clinicaVeterinaria.admitirMascota(new Gato("Don gato", Tipo.GATO,"Gato","Muy travieso"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Don gato"), "Necesidad de atencion", "Calmantes");

        clinicaVeterinaria.admitirMascota(new Gato("Hello Kitty", Tipo.GATO,"Perro","Fatiga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Hello Kitty"), "Explotacion de Marca", "Vacaciones");

        clinicaVeterinaria.admitirMascota(new Gato("Thunder Cat", Tipo.GATO,"Trueno","Exceso energia"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Thunder Cat"), "Fatiga", "Calmantes");

        clinicaVeterinaria.admitirMascota(new Gato("Tom", Tipo.GATO,"Negro","Fatiga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Tom"), "Exceso de persecucion a Jerry", "Otro Hobby");

        clinicaVeterinaria.admitirMascota(new Gato("Bola de Nieve", Tipo.GATO,"Blanco","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Bola de Nieve"), "Exceso de pelos", "omeprazol");

        clinicaVeterinaria.admitirMascota(new Conejo("Peter Rabbit", Tipo.CONEJO,"Conejo","Constipado"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Peter Rabbit"), "Exceso de comida", "Laxante");
        
        
        System.out.println("----");
        clinicaVeterinaria.mostrarDetalleDoctores();
        
        clinicaVeterinaria.admitirMascota(new Perro("Pedro", Tipo.PERRO,"Jack Russel Terrier","Dolor de Barriga"));
        clinicaVeterinaria.revisarMascota(clinicaVeterinaria.buscarMascota("Pedro"), "Comio mucho", "medicamento");


        } catch(java.lang.NullPointerException e){
            System.out.println("Mascota no encontrada");
        }


            }
}
