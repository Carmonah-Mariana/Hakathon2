public static Contacto buscarContacto(ArrayList<Contacto> agenda, String nombreBusqueda) {
    for (Contacto contacto : agenda) {

        if (contacto.getNombre().equalsIgnoreCase(nombreBusqueda)) {
            return contacto;
        }
    }
    return null;
}