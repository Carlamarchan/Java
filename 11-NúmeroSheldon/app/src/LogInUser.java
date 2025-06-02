public class LogInUser {
    public String usuario;
    public final String clave;
    public Boolean bloqueado;
    public int totalIntentos;

    public LogInUser(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.bloqueado = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public Boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public int getTotalIntentos() {
        return totalIntentos;
    }

    public void setTotalIntentos(int totalIntentos) {
        this.totalIntentos = totalIntentos;
    }


    public Boolean logIn(String clave) {

        if (totalIntentos <= 3 && (clave.equals(this.clave))) {
            return true;
        } else {
            totalIntentos++;
            this.setTotalIntentos(totalIntentos);
            if (totalIntentos == 3) {                
                this.bloqueado = true;
            }
            return false;
        }

    }

}
