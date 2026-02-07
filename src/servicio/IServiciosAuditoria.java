package servicio;

public interface IServiciosAuditoria
{
    void registrarAuditoria(String accion,String detalle);
    void mostrarAuditoria();
}
