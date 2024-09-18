package org.uv.tpcsw.practica01;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uv.tpcsw.practica01.dao.DAOEmpleado;
import org.uv.tpcsw.practica01.dao.DAOEmpleadoConcreto;
import org.uv.tpcsw.practica01.dao.EmpleadoPojo;

public class TPCSWPractica01 {

    public static void main(String[] args) {
        
        DAOEmpleadoConcreto dao = new DAOEmpleadoConcreto();
        EmpleadoPojo empleadoPojo= new EmpleadoPojo();
        
        empleadoPojo.setClave("10");
        empleadoPojo.setDireccion("calle real");
        empleadoPojo.setNombre("roa");
        empleadoPojo.setTelefono("21929291");
        dao.save(empleadoPojo);
        


    }

}
