
package gestionlab_i;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.sql.*;



public class Cliente_Muestra extends javax.swing.JFrame {
    public  DefaultListModel ElementosQuimicos = new DefaultListModel(); 
    private String fecha, cedula, nombre, apellido, celular, TlfFijo, correo, solicitud;
    ArrayList Cliente_Muestra;
    ArrayList <Cliente_Muestra> clientes = new ArrayList <Cliente_Muestra>();

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTlfFijo() {
        return TlfFijo;
    }

    public void setTlfFijo(String TlfFijo) {
        this.TlfFijo = TlfFijo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }
    

    
    
    
    
    public Cliente_Muestra() {
        initComponents();
        
        ElementosQuimicos = new DefaultListModel();
        
        } 
        
     
public String[] comboxEstado(String comboEstado){
    String[]comboMunicipio = new String[29]; 
      
        if (comboEstado.equalsIgnoreCase("Amazonas")){
              comboMunicipio[0]="Alto Orinoco";
               comboMunicipio[1]="Atabapo";
               comboMunicipio[2]="Atures";
               comboMunicipio[3]="Autana";
               comboMunicipio[4]="Maroa";
               comboMunicipio[5]="Manapiare";
               comboMunicipio[6]="Río Negro";
        }
        if (comboEstado.equalsIgnoreCase("Anzoátegui")){
               comboMunicipio[0]="Anaco";
               comboMunicipio[1]="Aragua";
               comboMunicipio[2]="Fernando Peñalver";
               comboMunicipio[3]="Francisco del Carmen Carvajal";
               comboMunicipio[4]="Francisco de Miranda";
               comboMunicipio[5]="Guanta";
               comboMunicipio[6]="Independencia";
               comboMunicipio[7]="Juan Antonio Sotillo";
               comboMunicipio[8]="Juan Manuel Cajigal";
               comboMunicipio[9]="José Gregorio Monagas";
               comboMunicipio[10]="Libertad";
               comboMunicipio[11]="Manuel Ezequil Bruzual";
               comboMunicipio[12]="Pedro María Fréites";
               comboMunicipio[13]="Píritu";
               comboMunicipio[14]="San José de Guanipa";
               comboMunicipio[15]="San Juan de Capistrano";
               comboMunicipio[16]="Santa Ana";
               comboMunicipio[17]="Simón Bolívar";
               comboMunicipio[18]="Simón Rodríguez";
               comboMunicipio[19]="Sir Arthur Mc Gregor";
               comboMunicipio[20]="Diego Bautista Urbaneja";
              
        }
         if (comboEstado.equalsIgnoreCase("Apure")){
               comboMunicipio[0]="Achaguas";
               comboMunicipio[1]="Biruaca";
               comboMunicipio[2]="Muñoz";
               comboMunicipio[3]="Páez";
               comboMunicipio[4]="Pedro Camejo";
               comboMunicipio[5]="Rómulo Gallegos";
               comboMunicipio[6]="San Fernando";
               
        }
        if (comboEstado.equalsIgnoreCase("Aragua")){
              comboMunicipio[0]="Bolívar";
               comboMunicipio[1]="Camatagua";
               comboMunicipio[2]="Giraldot";
               comboMunicipio[3]="José Ángel Lamas";
               comboMunicipio[4]="José Félix Ribas";
               comboMunicipio[5]="José Rafael Revenga";
               comboMunicipio[6]="Libertador";
               comboMunicipio[7]="Mario Briceño Iragorry";
               comboMunicipio[8]="San Casimiro";
               comboMunicipio[9]="San Sebastián";
               comboMunicipio[10]="Santiago Mariño";
               comboMunicipio[11]="Santos Michelena";
               comboMunicipio[12]="Sucre";
               comboMunicipio[13]="Tovar";
               comboMunicipio[14]="Urdaneta";
               comboMunicipio[15]="Zamora";
               comboMunicipio[16]="Francisco Linares Alcántara";
               comboMunicipio[17]="Ocumare de la Costa de Oro";
        }
        if (comboEstado.equalsIgnoreCase("Barinas")){
               comboMunicipio[0]="Alberto Arvelo Torrealba";
               comboMunicipio[1]="Antonio José de Sucre";
               comboMunicipio[2]="Arismendi";
               comboMunicipio[3]="Barinas";
               comboMunicipio[4]="Bolívar";
               comboMunicipio[5]="Cruz Paredez";
               comboMunicipio[6]="Ezequil Zamora";
               comboMunicipio[7]="Obispo";
               comboMunicipio[8]="Pedraza";
               comboMunicipio[9]="Rojas";
               comboMunicipio[10]="Sosa";
               comboMunicipio[11]="Andrés Eloy Blanco";
        }
        if (comboEstado.equalsIgnoreCase("Bolívar")){
               comboMunicipio[0]="Caroní";
               comboMunicipio[1]="Cedeño";
               comboMunicipio[2]="El Callao";
               comboMunicipio[3]="Gran Sabana";
               comboMunicipio[4]="Heres";
               comboMunicipio[5]="Piar";
               comboMunicipio[6]="Angostura";
               comboMunicipio[7]="Roscio";
               comboMunicipio[8]="Sifontes";
               comboMunicipio[9]="Sucre";
               comboMunicipio[10]="Padre Pedro Chien";
        }
        if (comboEstado.equalsIgnoreCase("Carabobo")){
               comboMunicipio[0]="Bejuma";
               comboMunicipio[1]="Carlos Aruelo";
               comboMunicipio[2]="Diego Ibarra";
               comboMunicipio[3]="Guacara";
               comboMunicipio[4]="Juan José Mora";
               comboMunicipio[5]="Libertador";
               comboMunicipio[6]="Guayos";
               comboMunicipio[7]="Miranda";
               comboMunicipio[8]="Montalbán";
               comboMunicipio[9]="Naguanagua";
               comboMunicipio[10]="Puerto Cabello";
               comboMunicipio[11]="San Diego";
               comboMunicipio[12]="San Joaquín";
               comboMunicipio[13]="Valencia";
        }
        if (comboEstado.equals("Cojedes")){
               comboMunicipio[0]="Anzoátegui";
               comboMunicipio[1]="Tinaquillo";
               comboMunicipio[2]="Girardot";
               comboMunicipio[3]="Lima Blanco";
               comboMunicipio[4]="Pao de San Juan Bautista";
               comboMunicipio[5]="Ricaute";
               comboMunicipio[6]="Rómulo Gallegos";
               comboMunicipio[7]="Ezequil Zamora";
               comboMunicipio[8]="Tinaco";
        }
        if (comboEstado.equalsIgnoreCase("Delta Amacuro")){
               comboMunicipio[0]="Antonio Díaz";
               comboMunicipio[1]="Casacoima";
               comboMunicipio[2]="Pedernales";
               comboMunicipio[3]="Tucupita";
        }
        if (comboEstado.equalsIgnoreCase("Distrito Capital")){
               comboMunicipio[0]="Libertador";
        }
        if (comboEstado.equalsIgnoreCase("Falcón")){
               comboMunicipio[0]="Acosta";
               comboMunicipio[1]="Bolívar";
               comboMunicipio[2]="Buchivacoa";
               comboMunicipio[3]="Cacique Manaure";
               comboMunicipio[4]="Carirubana";
               comboMunicipio[5]="Colina";
               comboMunicipio[6]="Dabajuro";
               comboMunicipio[7]="Democracia";
               comboMunicipio[8]="Falcón";
               comboMunicipio[9]="Federación";
               comboMunicipio[10]="Jacura";
               comboMunicipio[11]="Los Tanques";
               comboMunicipio[12]="Mauroa";
               comboMunicipio[13]="Miranda";
               comboMunicipio[14]="Monseñor Iturriza";
               comboMunicipio[15]="Palmasola";
               comboMunicipio[16]="Petit";
               comboMunicipio[17]="Píritu";
               comboMunicipio[18]="San Francisco";
               comboMunicipio[19]="Silva";
               comboMunicipio[20]="Sucre";
               comboMunicipio[21]="Tocópero";
               comboMunicipio[22]="Unión";
               comboMunicipio[23]="Urumaco";
               comboMunicipio[24]="Zamora";
        }
        if (comboEstado.equalsIgnoreCase("Guárico")){
              comboMunicipio[0]="Camaguán";
               comboMunicipio[1]="Chaguaramas";
               comboMunicipio[2]="El Socorro";
               comboMunicipio[3]="San Gerónimo de Guayabal";
               comboMunicipio[4]="Leonardo Infantes";
               comboMunicipio[5]="Las Mercedes";
               comboMunicipio[6]="Julián Mellado";
               comboMunicipio[7]="Francisco de Miranda";
               comboMunicipio[8]="José Tadeo Monagas";
               comboMunicipio[9]="Ortiz";
               comboMunicipio[10]="José Félix Ribas";
               comboMunicipio[11]="Juan Germán Roscio";
               comboMunicipio[12]="San José de Guaribe";
               comboMunicipio[13]="Santa María de Ipire";
               comboMunicipio[14]="Pedro Zaraza";
        }
        if (comboEstado.equalsIgnoreCase("Lara")){
               comboMunicipio[0]="Andrés Eloy Blanco";
               comboMunicipio[1]="Crespo";
               comboMunicipio[2]="Irribarren";
               comboMunicipio[3]="Jiménez";
               comboMunicipio[4]="Morán";
               comboMunicipio[5]="Palavecino";
               comboMunicipio[6]="Simón Planas";
               comboMunicipio[7]="Torres";
               comboMunicipio[8]="Urdaneta";
        }
        if (comboEstado.equalsIgnoreCase("Mérida")){
               comboMunicipio[0]="Alberto Adriani";
               comboMunicipio[1]="Andrés Bello";
               comboMunicipio[2]="Antonio Pinto Salinas";
               comboMunicipio[3]="Aricagua";
               comboMunicipio[4]="Arzobispo Chacón";
               comboMunicipio[5]="Campo Elías";
               comboMunicipio[6]="Caracciolo Parra Olmedo";
               comboMunicipio[7]="Cardenal Quintero";
               comboMunicipio[8]="Guaraque";
               comboMunicipio[9]="Julio César Salas";
               comboMunicipio[10]="Justo Briceño";
               comboMunicipio[11]="Libertador";
               comboMunicipio[12]="Miranda";
               comboMunicipio[13]="Obíspo Ramos de Lora";
               comboMunicipio[14]="Padre Noguera";
               comboMunicipio[15]="Pueblo Llano";
               comboMunicipio[16]="Rangel";
               comboMunicipio[17]="Rivas Dávila";
               comboMunicipio[18]="Santos Marquina";
               comboMunicipio[19]="Sucre";
               comboMunicipio[20]="Tovar";
               comboMunicipio[21]="Tulio Febres Cordero";
               comboMunicipio[22]="Zea ";
        }
        if (comboEstado.equalsIgnoreCase("Miranda")){
               comboMunicipio[0]="Acevedo";
               comboMunicipio[1]="Andrés Bello";
               comboMunicipio[2]="Baruta";
               comboMunicipio[3]="Brión";
               comboMunicipio[4]="Buroz";
               comboMunicipio[5]="Carrizal";
               comboMunicipio[6]="Chacao";
               comboMunicipio[7]="Cristóbal Rojas";
               comboMunicipio[8]="El Hatillo";
               comboMunicipio[9]="Guaicapuro";
               comboMunicipio[10]="Independencia";
               comboMunicipio[11]="Lander";
               comboMunicipio[12]="Los Salias";
               comboMunicipio[13]="Páez";
               comboMunicipio[14]="Paz Castillo";
               comboMunicipio[15]="Pedro Gual";
               comboMunicipio[16]="Plaza";
               comboMunicipio[17]="Simón Bolívar";
               comboMunicipio[18]="Sucre";
               comboMunicipio[19]="Urdaneta";
               comboMunicipio[20]="Zamora";
        }
        if (comboEstado.equalsIgnoreCase("Monagas")){
              comboMunicipio[0]="Acosta";
               comboMunicipio[1]="Aguasay";
               comboMunicipio[2]="Bolívar";
               comboMunicipio[3]="Caripe";
               comboMunicipio[4]="Cedeño";
               comboMunicipio[5]="Ezequil Zamora";
               comboMunicipio[6]="Libertador";
               comboMunicipio[7]="Maturín";
               comboMunicipio[8]="Piar";
               comboMunicipio[9]="Punceres";
               comboMunicipio[10]="Santa Bárbara";
               comboMunicipio[11]="Sotillo";
               comboMunicipio[12]="Uracoa";
       }
       if (comboEstado.equalsIgnoreCase("Nueva Esparta")){
               comboMunicipio[0]="Antolín del Campo";
               comboMunicipio[1]="Arismendi";
               comboMunicipio[2]="Díaz";
               comboMunicipio[3]="García";
               comboMunicipio[4]="Gómez";
               comboMunicipio[5]="Maneiro";
               comboMunicipio[6]="Marcano";
               comboMunicipio[7]="Mariño";
               comboMunicipio[8]="Península de Macanao";
               comboMunicipio[9]="Tubores";
               comboMunicipio[10]="Villalba";
        }
       if (comboEstado.equalsIgnoreCase("Portuguesa")){
              comboMunicipio[0]="Agua Blanca";
               comboMunicipio[1]="Araure";
               comboMunicipio[2]="Esteller";
               comboMunicipio[3]="Guanare";
               comboMunicipio[4]="Guamarito";
               comboMunicipio[5]="Monseñor José Vicente de Unda";
               comboMunicipio[6]="Ospino";
               comboMunicipio[7]="Páez";
               comboMunicipio[8]="Papelón";
               comboMunicipio[9]="San Genaro de Boconoito";
               comboMunicipio[10]="San Rafael de Onoto";
               comboMunicipio[11]="Santa Rosalía";
               comboMunicipio[12]="Sucre";
               comboMunicipio[13]="Turén";

        }
       if (comboEstado.equalsIgnoreCase("Sucre")){
               comboMunicipio[0]="Andrés Eloy Blanco";
               comboMunicipio[1]="Andrés Mata";
               comboMunicipio[2]="Arismendi";
               comboMunicipio[3]="Benítez";
               comboMunicipio[4]="Bermúdez";
               comboMunicipio[5]="Bolívar";
               comboMunicipio[6]="Cajigal";
               comboMunicipio[7]="Cruz Salmerón Acosta";
               comboMunicipio[8]="Libertador";
               comboMunicipio[9]="Mariño";
               comboMunicipio[10]="Mejía";
               comboMunicipio[11]="Montes";
               comboMunicipio[12]="Ribero";
               comboMunicipio[13]="Sucre";
               comboMunicipio[14]="Valdez";
        }
       if (comboEstado.equalsIgnoreCase("Táchira")){
               comboMunicipio[0]="Andrés Bello";
               comboMunicipio[1]="Antonio Rómulo Costa";
               comboMunicipio[2]="Ayacucho";
               comboMunicipio[3]="Bolívar";
               comboMunicipio[4]="Cárdenas";
               comboMunicipio[5]="Córdoba";
               comboMunicipio[6]="Fernández Feo";
               comboMunicipio[7]="Francisco de Miranda";
               comboMunicipio[8]="García de Hevia";
               comboMunicipio[9]="Guásimo";
               comboMunicipio[10]="Independencia";
               comboMunicipio[11]="Jáuregui";
               comboMunicipio[12]="José María Vargas";
               comboMunicipio[13]="Junín";
               comboMunicipio[14]="Libertad";
               comboMunicipio[15]="Libertador";
               comboMunicipio[16]="Lobatera";
               comboMunicipio[17]="Michelena";
               comboMunicipio[18]="Panamericano";
               comboMunicipio[19]="Pedro María Ureña";
               comboMunicipio[20]="Rafael Urdaneta";
               comboMunicipio[21]="Samuel Darío Maldonado";
               comboMunicipio[22]="San Cristóbal";
               comboMunicipio[23]="Seboruco";
               comboMunicipio[24]="Simón Rodríguez";
               comboMunicipio[25]="Sucre";
               comboMunicipio[26]="Torbes";
               comboMunicipio[27]="Uribante";
               comboMunicipio[28]="San Judas Tadeo";
        }
       if (comboEstado.equalsIgnoreCase("Trujillo")){
               comboMunicipio[0]="Andrés Bello";
               comboMunicipio[1]="Boconó";
               comboMunicipio[2]="Bolívar";
               comboMunicipio[3]="Candelaria";
               comboMunicipio[4]="Carache";
               comboMunicipio[5]="Escuque";
               comboMunicipio[6]="José Felipe Márquez Cañizales";
               comboMunicipio[7]="Juan Vicente Campo Elías";
               comboMunicipio[8]="La Ceiba";
               comboMunicipio[9]="Miranda";
               comboMunicipio[10]="Monte Carmelo";
               comboMunicipio[11]="Motatán";
               comboMunicipio[12]="Pampán";
               comboMunicipio[13]="Pampanito";
               comboMunicipio[14]="Rafael Rangel";
               comboMunicipio[15]="San Rafael de Carvajal";
               comboMunicipio[16]="Sucre";
               comboMunicipio[17]="Trujillo";
               comboMunicipio[18]="Urdaneta";
               comboMunicipio[19]="Valera";
        }
       if (comboEstado.equalsIgnoreCase("Vargas")){
               comboMunicipio[0]="Vargas";
        }
        if (comboEstado.equalsIgnoreCase("Yaracuy")){
               comboMunicipio[0]="Arístidez Bastidas";
               comboMunicipio[1]="Bolívar";
               comboMunicipio[2]="Bruzual";
               comboMunicipio[3]="Cocorote";
               comboMunicipio[4]="Independencia";
               comboMunicipio[5]="José Antonio Páez";
               comboMunicipio[6]="La Trinidad";
               comboMunicipio[7]="Manuel Monge";
               comboMunicipio[8]="Nirgua";
               comboMunicipio[9]="Peña";
               comboMunicipio[10]="San Felipe";
               comboMunicipio[11]="Sucre";
               comboMunicipio[12]="Urachiche";
               comboMunicipio[13]="Veroes";
        }
        if (comboEstado.equalsIgnoreCase("Zulia")){
               comboMunicipio[0]="Almirante Padilla";
               comboMunicipio[1]="Baralt";
               comboMunicipio[2]="Cabimas";
               comboMunicipio[3]="Catatumbo";
               comboMunicipio[4]="Colón";
               comboMunicipio[5]="Francisco Javier Pulgar";
               comboMunicipio[6]="Jesús Enrique Lossada";
               comboMunicipio[7]="Jesús María Semprún";
               comboMunicipio[8]="La Cañada de Urdaneta";
               comboMunicipio[9]="Lagunillas";
               comboMunicipio[10]="Machiques de Perijá";
               comboMunicipio[11]="Mara";
               comboMunicipio[12]="Maracaibo";
               comboMunicipio[13]="Miranda";
               comboMunicipio[14]="Indígena Bolivariano Guajira";
               comboMunicipio[15]="Rosario de Perijá";
               comboMunicipio[16]="San Francisco";
               comboMunicipio[17]="Santa Rita";
               comboMunicipio[18]="Simón Bolívar";
               comboMunicipio[19]="Sucre";
               comboMunicipio[20]="Valmore Rodríguez";
        }
        
    return comboMunicipio;
 }     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSolicitudMU = new javax.swing.JLabel();
        txtSolicitudMu = new javax.swing.JTextField();
        lblTituloCliente = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtTlfFijo = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        lblTlfFijo = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTituloMuestra = new javax.swing.JLabel();
        spinerCantidadMuestra = new javax.swing.JSpinner();
        chcboxGeologica = new javax.swing.JCheckBox();
        chcboxAgua = new javax.swing.JCheckBox();
        chcboxSuelo = new javax.swing.JCheckBox();
        chcboxPolvo = new javax.swing.JCheckBox();
        lblCantidad = new javax.swing.JLabel();
        lblOtraTipoMuestra = new javax.swing.JLabel();
        txtOtroTipoMuestra = new javax.swing.JTextField();
        lblTituloPreocedencia = new javax.swing.JLabel();
        comboxEstado = new javax.swing.JComboBox<>();
        comboxMunicipio = new javax.swing.JComboBox<>();
        comboxParroquia = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        lblParroquia = new javax.swing.JLabel();
        lblTituloTipoAnalisis = new javax.swing.JLabel();
        chcboxPetrografia = new javax.swing.JCheckBox();
        chcboxDRX = new javax.swing.JCheckBox();
        chcboxMEB = new javax.swing.JCheckBox();
        chcboxFRX = new javax.swing.JCheckBox();
        chcboxICP = new javax.swing.JCheckBox();
        chcboxQuimico = new javax.swing.JCheckBox();
        lblDiablo = new javax.swing.JLabel();
        lblRealizadoPor = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        lblObservaciones = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtSolicitud = new javax.swing.JTextField();
        lblSolicitud = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        lblFechaSolicitud = new javax.swing.JLabel();
        btnElementosQuimica = new javax.swing.JButton();
        btnAceptarElementos = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtANombreMuestra = new javax.swing.JTextArea();
        lblNombreMuestra = new javax.swing.JLabel();
        btnRegresarPrincipal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaListaElemento = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOLICITUD (Cliente - Muestras - Analisis)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSolicitudMU.setText("Solicitud#");
        getContentPane().add(lblSolicitudMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));
        getContentPane().add(txtSolicitudMu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 140, -1));

        lblTituloCliente.setText("CLIENTE");
        getContentPane().add(lblTituloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 60, 20));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 150, -1));

        lblCedula.setText("Cedula");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        lblApellido.setText("Apellido");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 160, -1));
        getContentPane().add(txtTlfFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 160, -1));

        lblCelular.setText("Tlef. Celular");
        getContentPane().add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        lblTlfFijo.setText("Tlef. Fijo");
        getContentPane().add(lblTlfFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        lblCorreo.setText("Correo ");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        lblTituloMuestra.setText("MUESTRA");
        getContentPane().add(lblTituloMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        spinerCantidadMuestra.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
        getContentPane().add(spinerCantidadMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, -1));

        chcboxGeologica.setBackground(new java.awt.Color(178, 154, 1));
        chcboxGeologica.setText("Geologica");
        getContentPane().add(chcboxGeologica, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        chcboxAgua.setBackground(new java.awt.Color(178, 154, 1));
        chcboxAgua.setText("Agua");
        getContentPane().add(chcboxAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        chcboxSuelo.setBackground(new java.awt.Color(178, 154, 1));
        chcboxSuelo.setText("Suelo");
        getContentPane().add(chcboxSuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        chcboxPolvo.setBackground(new java.awt.Color(178, 154, 1));
        chcboxPolvo.setText("Polvo");
        getContentPane().add(chcboxPolvo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        lblCantidad.setText("Cantidad");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lblOtraTipoMuestra.setText("Otro");
        getContentPane().add(lblOtraTipoMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));
        getContentPane().add(txtOtroTipoMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 240, -1));

        lblTituloPreocedencia.setText("PROCEDENCIA");
        getContentPane().add(lblTituloPreocedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        comboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar", "Carabobo", "Cojedes", "Delta Amacuro", "Distrito Capital", "Falcón", "Guárico", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia" }));
        comboxEstado.setSelectedItem(comboxEstado);
        comboxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboxEstadoItemStateChanged(evt);
            }
        });
        comboxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 180, -1));
        getContentPane().add(comboxMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 170, -1));

        comboxParroquia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "En Construcción" }));
        getContentPane().add(comboxParroquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 210, -1));

        lblEstado.setText("Estado");
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        lblMunicipio.setText("Municipio");
        getContentPane().add(lblMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        lblParroquia.setText("Parroquia");
        getContentPane().add(lblParroquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        lblTituloTipoAnalisis.setText("TIPO DE ANALISIS");
        getContentPane().add(lblTituloTipoAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        chcboxPetrografia.setBackground(new java.awt.Color(117, 126, 5));
        chcboxPetrografia.setText("Petrografia");
        getContentPane().add(chcboxPetrografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        chcboxDRX.setBackground(new java.awt.Color(117, 126, 5));
        chcboxDRX.setText("DRX");
        getContentPane().add(chcboxDRX, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        chcboxMEB.setBackground(new java.awt.Color(117, 126, 5));
        chcboxMEB.setText("MEB");
        getContentPane().add(chcboxMEB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        chcboxFRX.setBackground(new java.awt.Color(117, 126, 5));
        chcboxFRX.setText("FRX");
        getContentPane().add(chcboxFRX, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        chcboxICP.setBackground(new java.awt.Color(117, 126, 5));
        chcboxICP.setText("ICP");
        getContentPane().add(chcboxICP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        chcboxQuimico.setBackground(new java.awt.Color(117, 126, 5));
        chcboxQuimico.setText("Quimico");
        getContentPane().add(chcboxQuimico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        lblDiablo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diablo_a_1.png"))); // NOI18N
        getContentPane().add(lblDiablo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 40, 30));

        lblRealizadoPor.setText("Realizado por: imosquerad@yahoo.com.mx");
        getContentPane().add(lblRealizadoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));
        getContentPane().add(txtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 790, 40));

        lblObservaciones.setText("Observaciones");
        getContentPane().add(lblObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        btnActualizar.setText("ACTUALIZAR");
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        btnEliminar.setText("ELIMINAR");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));
        getContentPane().add(txtSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

        lblSolicitud.setText("Solicitud#");
        getContentPane().add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnRegistrarCliente.setText("REGISTRAR CLIENTE");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        btnActualizarCliente.setText("ACTUALIZAR CLIENTE");
        getContentPane().add(btnActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        lblFechaSolicitud.setText("Fecha");
        getContentPane().add(lblFechaSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        btnElementosQuimica.setText("Seleccionar Elementos");
        btnElementosQuimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElementosQuimicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnElementosQuimica, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        btnAceptarElementos.setText("Aceptar Elementos");
        btnAceptarElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarElementosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptarElementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 230, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 220, -1));

        txtANombreMuestra.setColumns(20);
        txtANombreMuestra.setRows(5);
        jScrollPane1.setViewportView(txtANombreMuestra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 50));

        lblNombreMuestra.setText("Nombre de la(s) muestras");
        getContentPane().add(lblNombreMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        btnRegresarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaIzq.png"))); // NOI18N
        btnRegresarPrincipal.setText("Principal");
        btnRegresarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, 30));

        textAreaListaElemento.setColumns(20);
        textAreaListaElemento.setRows(5);
        jScrollPane2.setViewportView(textAreaListaElemento);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 348, 370, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_1200_700.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboxEstadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.comboxEstado.getSelectedIndex() > 0) {
                this.comboxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(this.comboxEstado(this.comboxEstado.getSelectedItem().toString())));
            }
        }

    }//GEN-LAST:event_comboxEstadoItemStateChanged

    private void comboxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxEstadoActionPerformed

    private void btnElementosQuimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElementosQuimicaActionPerformed
        
        TablaPeriodicaMuestras ventana = new TablaPeriodicaMuestras();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnElementosQuimicaActionPerformed

    private void btnAceptarElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarElementosActionPerformed
        AceptarElementos();
        
        TablaPeriodicaMuestras ventana = new TablaPeriodicaMuestras();
        
        //elemento = (ventana.elemento);
        //elemento.addElement(ventana.elementoE);
        //elementoE.addElement(ventana.elemento);
        
        //listaElementos.setModel(elementoE);
        //listaElementos.setModel(elemento);
        //btnAceptarElementos.updateUI();
        
    }//GEN-LAST:event_btnAceptarElementosActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        RegistraClienteTxt();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        RegistraMuestraTxt();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPrincipalActionPerformed
        Principal construccion = new Principal();
        construccion.setBounds(0, 0, 1082, 656);
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /*Cliente_Muestra construccion = new Cliente_Muestra();
        construccion.setBounds(0, 0, 1082, 656);
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);*/

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarElementos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnElementosQuimica;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegresarPrincipal;
    private javax.swing.JCheckBox chcboxAgua;
    private javax.swing.JCheckBox chcboxDRX;
    private javax.swing.JCheckBox chcboxFRX;
    private javax.swing.JCheckBox chcboxGeologica;
    private javax.swing.JCheckBox chcboxICP;
    private javax.swing.JCheckBox chcboxMEB;
    private javax.swing.JCheckBox chcboxPetrografia;
    private javax.swing.JCheckBox chcboxPolvo;
    private javax.swing.JCheckBox chcboxQuimico;
    private javax.swing.JCheckBox chcboxSuelo;
    private javax.swing.JComboBox<String> comboxEstado;
    private javax.swing.JComboBox<String> comboxMunicipio;
    private javax.swing.JComboBox<String> comboxParroquia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDiablo;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaSolicitud;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreMuestra;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblOtraTipoMuestra;
    private javax.swing.JLabel lblParroquia;
    private javax.swing.JLabel lblRealizadoPor;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JLabel lblSolicitudMU;
    private javax.swing.JLabel lblTituloCliente;
    private javax.swing.JLabel lblTituloMuestra;
    private javax.swing.JLabel lblTituloPreocedencia;
    private javax.swing.JLabel lblTituloTipoAnalisis;
    private javax.swing.JLabel lblTlfFijo;
    private javax.swing.JSpinner spinerCantidadMuestra;
    private javax.swing.JTextArea textAreaListaElemento;
    private javax.swing.JTextArea txtANombreMuestra;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtOtroTipoMuestra;
    private javax.swing.JTextField txtSolicitud;
    private javax.swing.JTextField txtSolicitudMu;
    private javax.swing.JTextField txtTlfFijo;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void While(boolean hasNextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
private static class comboxMunicipio {

        public comboxMunicipio(String toString) {
        }
    }

    

    private static class Cliente {

        public Cliente() {
        }
    }

    private static class List<T> {

        public List() {
        }

        private void add(String linea) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class datosClientes {
             
        
        public datosClientes() {
           
        }
    }

    private static class Clientes {

        public Clientes() {
        }

        private String setFecha(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }

        private void setCedula(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setNombre(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setCelular(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setTlfFijo(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setCorreo(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setSolicitud(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setApellido(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }

    

    private class comboxEstado {

        

        public comboxEstado() {
        }
    }

    @SuppressWarnings("empty-statement")
    public void RegistraClienteTxt() {
       
            fecha = txtFecha.getText().trim();
            cedula = txtCedula.getText().trim();
            nombre = txtNombre.getText().trim();
            apellido = txtApellido.getText().trim();
            celular = txtCelular.getText().trim();
            TlfFijo = txtTlfFijo.getText().trim();
            correo = txtCorreo.getText().trim();
            solicitud = txtSolicitud.getText().trim();
            
        if (fecha.equals("") || cedula.equals("") || nombre.equals("") || apellido.equals("") || celular.equals("") || TlfFijo.equals("")
                || correo.equals("") || solicitud.equals("")) {
 
                if (fecha.equals("")) {
                  txtFecha.setBackground(Color.red);
                }
                if (cedula.equals("")) {
                  txtCedula.setBackground(Color.red);
                }
                if (nombre.equals("")) {
                  txtNombre.setBackground(Color.red);
                }
                if (apellido.equals("")) {
                  txtApellido.setBackground(Color.red);
                }
                if (celular.equals("")) {
                  txtCelular.setBackground(Color.red);
                }
                if (TlfFijo.equals("")) {
                  txtTlfFijo.setBackground(Color.red);
                }
                if (correo.equals("")) {
                  txtCorreo.setBackground(Color.red);
                }
                if (solicitud.equals("")) {
                  txtSolicitud.setBackground(Color.red);
                }
                
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            LimpiarCliente();
        }else{
        
       /* File archivo = new File("BasesDatosTXT/Cliente.txt");
        Scanner s = null; 
        String linea;
        FileWriter escribir;*/
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");
              PreparedStatement pst = cn.prepareStatement("insert into Cliente values(?,?,?,?,?,?,?,?,?)");
              
              pst.setString(1, "0");
              pst.setString(2, fecha); 
              pst.setString(3, cedula); 
              pst.setString(4, nombre);
              pst.setString(5, apellido);
              pst.setString(6, celular); 
              pst.setString(7, TlfFijo); 
              pst.setString(8, correo);
              pst.setString(9, solicitud);
              pst.executeUpdate();
               
              LimpiarCliente();
              JOptionPane.showMessageDialog(null, "Registro Exitoso");
              
           /* escribir = new FileWriter(archivo, true);
            escribir.write(fecha + " / " + cedula + " / " + nombre + " / " + apellido + " / " + celular + " / " + TlfFijo + 
                    " / " + correo + " / " + solicitud + "\r\n");//+ spinnerFechaSolicitud);
            
            
            escribir.close();*/

        txtFecha.setBackground(Color.green);
        txtCedula.setBackground(Color.green);
        txtNombre.setBackground(Color.green);
        txtApellido.setBackground(Color.green);
        txtCelular.setBackground(Color.green);
        txtTlfFijo.setBackground(Color.green);
        txtCorreo.setBackground(Color.green);
        txtSolicitud.setBackground(Color.green);
        
            JOptionPane.showMessageDialog(null,"Datos registrados con exito");
            LimpiarCliente();
            
        }catch (Exception e){
                JOptionPane.showMessageDialog(null, " Error en coneccion " + e);
            }
        txtFecha.setText("");
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCelular.setText("");
        txtTlfFijo.setText("");
        txtCorreo.setText("");
        txtSolicitud.setText("");
        }

    }
    
    public void RegistraMuestraTxt() {
        
        int cantidadMuestra = 0;
        String nombreMuestra = "";
        String geologica = "";
        String agua = "";
        String suelo = "";
        String polvo = "";
        String otroTipoMuestra = "";
        String solicitudMu = "";
        
        String estado = "";
        String municipio = "";
        String parroquia = "";
        
        String petrografia = "";
        String DRX = "";
        String MEB = "";
        String FRX = "";
        String ICP = "";
        String quimico = "";
        String listaElemento = "";
        String observaciones = "";
        
 /* Integer.parseInt( getSpinner().getValue().toString()) 
        */       
        cantidadMuestra = (int) spinerCantidadMuestra.getValue();
        nombreMuestra = txtANombreMuestra.getText();
        geologica = chcboxGeologica.getText();
        agua = chcboxAgua.getText();
        suelo = chcboxSuelo.getText();
        polvo = chcboxPolvo.getText();
        otroTipoMuestra = txtOtroTipoMuestra.getText();
        solicitudMu = txtSolicitudMu.getText();
        
        estado = comboxEstado.getSelectedItem().toString();
        municipio = comboxMunicipio.getSelectedItem().toString();
        parroquia = comboxParroquia.getSelectedItem().toString();
        
        petrografia = chcboxPetrografia.getText();
        DRX = chcboxDRX.getText();
        MEB = chcboxMEB.getText();
        FRX = chcboxFRX.getText();
        ICP = chcboxICP.getText();
        quimico = chcboxQuimico.getText();
        listaElemento = textAreaListaElemento.getText();
        observaciones = txtObservaciones.getText();

        if (cantidadMuestra <= 0 || geologica.equals("") || agua.equals("") || suelo.equals("") || polvo.equals("") || 
                otroTipoMuestra.equals("") || estado.equals("") || petrografia.equals("") || DRX.equals("") || MEB.equals("") ||
                FRX.equals("") || ICP.equals("") || quimico.equals("") || observaciones.equals("")) {
        
            if(cantidadMuestra <= 0){
               spinerCantidadMuestra.setBackground(Color.red); 
            }
            if(nombreMuestra.equals("")){
               txtANombreMuestra.setBackground(Color.red); 
            }
            if(geologica.equals("")){
               chcboxGeologica.setBackground(Color.red);
            }
            if(agua.equals("")){
               chcboxAgua.setBackground(Color.red); 
            }
            if(suelo.equals("")){
               chcboxSuelo.setBackground(Color.red); 
            }
            if(polvo.equals("")){
               chcboxPolvo.setBackground(Color.red); 
            }
            if(otroTipoMuestra.equals("")){
               txtOtroTipoMuestra.setBackground(Color.red); 
            }
            if(estado.equals("")){
               comboxEstado.setBackground(Color.red); 
            }
            /*if(municipio.equals("")){
               Municipio.setBackground(Color.red); 
            }*/
            if(petrografia.equals("")){
               chcboxPetrografia.setBackground(Color.red); 
            }
            if(DRX.equals("")){
               chcboxDRX.setBackground(Color.red); 
            }
            if(MEB.equals("")){
               chcboxMEB.setBackground(Color.red); 
            }
            if(FRX.equals("")){
               chcboxFRX.setBackground(Color.red); 
            }
            if(ICP.equals("")){
               chcboxICP.setBackground(Color.red); 
            }
            if(quimico.equals("")){
               chcboxQuimico.setBackground(Color.red); 
            }
            /*if(listaElemento.equals("")){
               listaElementos.setBackground(Color.red); 
            }*/
            if(observaciones.equals("")){
               txtObservaciones.setBackground(Color.red); 
            }
            
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            limpiarMuestra();
        }else{
        
        //File archivo = new File("BasesDatosTXT/Muestra.txt");
        //FileWriter escribir;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");
              PreparedStatement pst = cn.prepareStatement("insert into Muestra values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
// Muestras              
              pst.setString(1, "");
              pst.setInt(2, cantidadMuestra); 
              pst.setString(3, nombreMuestra);
              
              if(chcboxGeologica.isSelected()){
                 pst.setString(4, geologica); 
              }else{
                 pst.setString(4, ""); 
              }
              if(chcboxAgua.isSelected()){
                 pst.setString(5, agua); 
              }else{
                 pst.setString(5, ""); 
              }
              if(chcboxSuelo.isSelected()){
                 pst.setString(6, suelo); 
              }else{
                 pst.setString(6, ""); 
              }
              if(chcboxPolvo.isSelected()){
                 pst.setString(7, polvo); 
              }else{
                 pst.setString(7, ""); 
              }
              pst.setString(8, otroTipoMuestra);
              pst.setString(9, solicitudMu);
// Procedencia 
              pst.setString(10, estado);
              pst.setString(11, municipio); 
              //pst.setString(12, parroquia);
// Tipo de Analisis
              
              if(chcboxPetrografia.isSelected()){
                 pst.setString(12, petrografia);   
               }else{
                 pst.setString(12, ""); 
              }
              if(chcboxDRX.isSelected()){
                 pst.setString(13, DRX);   
               }else{
                 pst.setString(13, ""); 
              }
              if(chcboxMEB.isSelected()){
                  pst.setString(14, MEB);  
                }else{
                 pst.setString(14, ""); 
              }
              if(chcboxFRX.isSelected()){
                 pst.setString(15, FRX);   
               }else{
                 pst.setString(15, ""); 
              }
              if(chcboxICP.isSelected()){
                 pst.setString(16, ICP);   
                }else{
                 pst.setString(16, ""); 
              }
              if(chcboxQuimico.isSelected()){
                 pst.setString(17, quimico);   
                }else{
                 pst.setString(17, ""); 
              }
              
              pst.setString(18, observaciones);

              pst.executeUpdate();
               
              LimpiarCliente();
              JOptionPane.showMessageDialog(null, "Registro Exitoso");
            /*escribir = new FileWriter(archivo, true);

            escribir.write(cantidadMuestra + "  " + nombreMuestra + "  " + geologica + "  " + agua + "  " + suelo + "  " + polvo + "  " + 
                    "  " + otroTipoMuestra + "  " + solicitudMu + "   " + estado + "  " + municipio + "  " + petrografia + "  " + DRX +
                     //"  " + MEB + "  " + FRX + "  " + ICP + "  " + quimico + /*"\t" + listaElemento + "  "  
                    //"\r");
            
            //escribir.close();*/
             
            spinerCantidadMuestra.setBackground(Color.green);
            txtANombreMuestra.setBackground(Color.green);
            chcboxGeologica.setBackground(Color.green);
            chcboxAgua.setBackground(Color.green);
            chcboxSuelo.setBackground(Color.green);
            chcboxPolvo.setBackground(Color.green);
            txtOtroTipoMuestra.setBackground(Color.green);
            comboxEstado.setBackground(Color.green);
            //comboxMunicipio.setBackground(Color.green); 
            chcboxPetrografia.setBackground(Color.green);
            chcboxDRX.setBackground(Color.green);
            chcboxMEB.setBackground(Color.green);
            chcboxFRX.setBackground(Color.green);
            chcboxICP.setBackground(Color.green);
            chcboxQuimico.setBackground(Color.green);
            //listaElementos.setBackground(Color.green); 
            txtObservaciones.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(null,"Datos registrados con exito");
            limpiarMuestra();
            
        }catch (Exception e){
                JOptionPane.showMessageDialog(null, " Error en coneccion " + e);
            }
        spinerCantidadMuestra.setValue(0);
        txtANombreMuestra.setText("");
        chcboxGeologica.setText("");
        chcboxAgua.setText("");
        chcboxSuelo.setText("");
        chcboxPolvo.setText("");
        txtOtroTipoMuestra.setText("");
        
        comboxEstado.setSelectedItem("");
        //comboxMunicipio.setSelectedItem("");
        //comboxParroquia.setSelectedItem("");
        
        chcboxPetrografia.setText("");
        chcboxDRX.setText("");
        chcboxMEB.setText("");
        chcboxFRX.setText("");
        chcboxICP.setText("");
        chcboxQuimico.setText("");
        //llistaElementos.setSelectedValue();
        txtObservaciones.setText("");
        }
    }
    
    public void LimpiarCliente() {

        txtFecha.setBackground(new Color(255,255,255));
        txtCedula.setBackground(new Color(255,255,255));
        txtNombre.setBackground(new Color(255,255,255));
        txtApellido.setBackground(new Color(255,255,255));
        txtCelular.setBackground(new Color(255,255,255));
        txtTlfFijo.setBackground(new Color(255,255,255));
        txtCorreo.setBackground(new Color(255,255,255));
        txtSolicitud.setBackground(new Color(255,255,255));

    }
    
    public void limpiarMuestra(){
        spinerCantidadMuestra.setBackground(Color.green);
            txtANombreMuestra.setBackground(new Color(255,255,255));
            chcboxGeologica.setBackground(new Color(178,154,1));
            chcboxAgua.setBackground(new Color(178,154,1));
            chcboxSuelo.setBackground(new Color(178,154,1));
            chcboxPolvo.setBackground(new Color(178,154,1));
            txtOtroTipoMuestra.setBackground(new Color(255,255,255));
            comboxEstado.setBackground(new Color(238,238,238));
            //comboxMunicipio.setBackground(new Color(238,238,238)); 
            chcboxPetrografia.setBackground(new Color(117,126,5));
            chcboxDRX.setBackground(new Color(117,126,5));
            chcboxMEB.setBackground(new Color(117,126,5));
            chcboxFRX.setBackground(new Color(117,126,5));
            chcboxICP.setBackground(new Color(117,126,5));
            chcboxQuimico.setBackground(new Color(117,126,5));
            //listaElementos.setBackground(new Color(255,255,255)); 
            txtObservaciones.setBackground(new Color(255,255,255));
    }
    
    public void BuscarCliente() {
        String cedUsua = JOptionPane.showInputDialog("Introduzca el numero de cedula del cliente a buscar: ");
        
        String fecha = "";
        String cedula = "";
        String nombre = "";
        String apellido = "";
        String celular = "";
        String TlfFijo = "";
        String correo = "";
        String solicitud = "";
        
        //BufferedReader almacenamiento;
        File fichero = new File ("BasesDatosTXT/Cliente.txt");
        Scanner s = null;
        String cadena;
        try {
            //almacenamiento = new BufferedReader(new java.io.FileReader("BasesDatos/Cliente.txt"));
            s = new Scanner (fichero);
            while (s.hasNextLine()) {

                String linea = s.nextLine();
                String [] cortarString = linea.split(" / ");
                System.out.println("Esto es lines " + linea);
                System.out.println("Esto es cortarString " + cortarString.getClass());
                
            txtFecha.setText(cortarString[0]);
            txtCedula.setText(cortarString[1]);
            txtNombre.setText(cortarString[2]);
            txtApellido.setText(cortarString[3]);
            txtCelular.setText(cortarString[4]);
            txtTlfFijo.setText(cortarString[5]);
            txtCorreo.setText(cortarString[6]);
            txtSolicitud.setText(cortarString[7]);
                 
                cadena = "";
            }
        
            s.close();
            
            //almacenamiento.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
    
    public void AceptarElementos(){
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");

            ps = cn.prepareStatement("SELECT ElementosQuimicos  FROM Muestra" );
            ps.setString(1, ElementosQuimicos.toString());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                textAreaListaElemento.setText(rs.getString("ElementosQuimicos"));    
            }
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, " Error en coneccion " + e);
            }
    }
 /*
    ps.setString(1, codigo);
    rs = ps.executeQuery();

            while (rs.next()) {
                txt_ID.setText(rs.getString("ID"));
    */
       
}
