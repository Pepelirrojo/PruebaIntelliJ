import java.sql.*;

public class MiConexion {
    private String db = "nba";
    private String login = "root";
    private String pwd = "";
    private String url = "jdbc:mysql://localhost/" + db + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Connection conexion;

    public MiConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            System.out.println("Conexxion Establecida Correctamente");
        } catch (ClassNotFoundException e){
            System.out.println("Driver JDBC no encontrado");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("Error al conectar a la BBDD");
            e.printStackTrace();
        }
    }
    public void terminarConex(){
        try {
            conexion.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        MiConexion miPrueba = new MiConexion();
        miPrueba.terminarConex();
    }
}
