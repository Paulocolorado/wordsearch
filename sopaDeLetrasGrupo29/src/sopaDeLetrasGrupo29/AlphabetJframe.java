package sopaDeLetrasGrupo29;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Label;
import java.util.Iterator;
import java.util.Random;
import java.awt.Component;
import java.awt.GridLayout;

public class AlphabetJframe extends javax.swing.JFrame {

	Final fin;
//	private JPanel Sopa_de_letra;
	JLabel word[];
	String words[];
	JLabel letter[][];
	int beginx[];
	int beginy[];
	boolean win;
	boolean address[];
	
    
    public AlphabetJframe() 
    {
        initComponents();
        word = new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        this.setLocationRelativeTo(null);
        upload();
        words=new String[10];
        word=new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        for (int i = 0; i < letter.length; i++) {
        	words[i]=word[i].getText();
        	System.out.println("words" + words + "word" + word +p1);
        }
    }
	
public void initComponents() {
		
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        Sopa_de_letra = new javax.swing.JPanel();
        JPanel SopaDeLetras = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 604);
		Principal = new JPanel();
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Principal);
		Principal.setLayout(null);
		
		Sopa_de_letra = new JPanel();
		Sopa_de_letra.setBorder(new LineBorder(new Color(0, 0, 0)));
		Sopa_de_letra.setBounds(37, 76, 514, 463);
		Principal.add(Sopa_de_letra);
		Sopa_de_letra.setLayout(new GridLayout(10, 14, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(569, 76, 167, 463);
		Principal.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPalabrasABuscar = new JLabel("Palabras a buscar");
		lblPalabrasABuscar.setBounds(15, 5, 137, 22);
		lblPalabrasABuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblPalabrasABuscar);
		
		Sopa_de_letra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		Sopa_de_letra.setLayout(new java.awt.GridLayout(10, 14));
		
		Label p1 = new Label("Programacion");
		p1.setText("Programacion");
		p1.setBounds(15, 33, 102, 24);
		p1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p1);
//		Label p1 = new Label("AAAAAAA");
//		p1.setText("AAAAAAA");
//		p1.setBounds(15, 33, 102, 24);
//		p1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
//		panel_1.add(p1);
//        p1.setBackground(new java.awt.Color(0, 204, 255));
//        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        p1.setText("AAAAAAA");

		
		Label p2 = new Label("Polimorfismo");
		p2.setBounds(15, 62, 94, 24);
		p2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p2);
		
		Label p3 = new Label("Herencia");
		p3.setBounds(15, 90, 70, 24);
		p3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p3);
		
		Label p4 = new Label("Constructor");
		p4.setBounds(15, 120, 88, 24);
		p4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p4);
		
		Label p5 = new Label("Algoritmo");
		p5.setBounds(15, 150, 73, 24);
		p5.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p5);
		
		Label p6 = new Label("Clase");
		p6.setBounds(15, 178, 50, 24);
		p6.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p6);
		
		Label p7 = new Label("Array");
		p7.setBounds(15, 208, 48, 24);
		p7.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p7);
		
		Label p8 = new Label("Compilar");
		p8.setBounds(15, 238, 70, 24);
		p8.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p8);
		
		Label p9 = new Label("Diagrama");
		p9.setBounds(15, 268, 75, 24);
		p9.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p9);
		
		Label p10 = new Label("M\u00E9todo");
		p10.setBounds(15, 295, 61, 24);
		p10.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_1.add(p10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(37, 11, 699, 54);
		Principal.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Sopa de letras grupo 29");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(lblNewLabel);
		System.out.println("Variable p1 " + p1);
	}



	public void letterBoxes()
    {
		letter=new JLabel[10][14];
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 14; j++) {
            	letter[i][j]=new JLabel("", javax.swing.SwingConstants.CENTER);
            	letter[i][j].setName("A");
            	letter[i][j].setBackground(Color.WHITE);
            	letter[i][j].setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); 
            	letter[i][j].setForeground(new java.awt.Color(0, 5, 2));
            	letter[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            	letter[i][j].setOpaque(true);
            	letter[i][j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
            	letter[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                    	eventClick(evt);
                    }
                });
            	Sopa_de_letra.add(letter[i][j]);
            	System.out.println("Sopa_de_letra " + Sopa_de_letra);
            }
        }
    }
	
    public void eventClick(java.awt.event.MouseEvent evt) {
        if (!win) {
            if (evt.getComponent().getBackground().equals(Color.WHITE))
            {
                evt.getComponent().setBackground(new java.awt.Color(51, 51, 255));
                doneWord();
            }else if(evt.getComponent().getName().equals(""))
            {
                evt.getComponent().setBackground(Color.WHITE);
            }
        }
    }
    
    public void doneWord() 
    {
        for (int i = 0; i < 10; i++) 
        {
            if (!word[i].getText().substring(0, 1).equals("<")) {
                if (doneLetter(beginx[i],beginy[i],word[i].getText().length(),address[i]))
                {
                	word[i].setText("<html><body><s>"+word[i].getText()+"</s></body></html>");
                    break;
                }
            }
        }
        boolean aux=true;
        for (int i = 0; i < letter.length; i++)
        {
            if (!word[i].getText().substring(0, 1).equals("<")) 
            {
                aux=false;
                break;
            }
        }
        if (aux) {
            if (!(fin instanceof Final)) 
            { 
                fin = new Final();   
                win=true;
            } 
            CentrarVentanaInterna(fin); 
        }
    }
    
    public void CentrarVentanaInterna(JInternalFrame internalFrame) 
    { 
        int x = (escritorio.getWidth() / 2) - internalFrame.getWidth() / 2; 
        int y = (escritorio.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {
            internalFrame.setLocation(x, y); 
        } 
        else
        {
            escritorio.add(internalFrame); 
            internalFrame.setLocation(x, y); 
            internalFrame.show(); 
        }
    }
    
    public boolean  doneLetter(int x,int y,int tamaño,boolean direccion) {
        boolean respuesta=true;
        if (direccion) {
            for (int i = y; i < tamaño+y; i++) {
                if (letter[x][i].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }else
        {
            for (int j = y; j >y-tamaño; j--) {
                if (letter[x][j].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }
        return respuesta;
    }
    

    
    
    public void upload()
    {
        win=false;
        beginx=new int[12];
        beginy=new int[12];
        address=new boolean[10];
        letterBoxes();
        putWords();
        fillSpaces();

        
    }
    
    
    public void putWords() 
    {
    	System.out.println("----p1----- " + p1 + "----------");
        String word[]={p1.getText(),p2.getText(),p3.getText(),p4.getText(),p5.getText(),p6.getText(),p7.getText(),p8.getText(),p9.getText(),p10.getText()};
        Random random=new Random();
        int iniciax=0;
        int iniciay;
        int unico[]=NumerosSinRepeticiones(10);
        beginx=unico;
		
		System.out.println("Variable p2  " + p2 + " word " + word[1]);
        for (int i = 0; i < word.length; i++) {
            if (word[i].length()<14) {
                iniciax=unico[i];
                iniciay=(int)(random.nextDouble()*14-1);
                int extrae=0;
                if (iniciay+word[i].length()<14) {
                    for (int j = iniciay; j < iniciay+word[i].length(); j++) {
                        letter[iniciax][j].setText(word[i].substring(extrae, extrae+1));
                        letter[iniciax][j].setName("1");
                        extrae++;
                        beginy[i]=iniciay;
                        address[i]=true;
                    }
                } else if (iniciay-word[i].length()>0)
                {
                    for (int j = iniciay; j >iniciay-word[i].length() ; j--) {
                        letter[iniciax][j].setText(word[i].substring(extrae, extrae+1));
                        letter[iniciax][j].setName("1");
                        extrae++;
                        beginy[i]=iniciay;
                        address[i]=false;
                    }
                }
            }
        }
    }
  
    
    public int[] NumerosSinRepeticiones(int repeticiones) {
        int numeros[]=new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            numeros[i]=-1;
        }
        Random random=new Random();
        boolean aux ;
        int numero=0;
        for (int x = 0; x < repeticiones; x++) 
        {
            aux = true;
            while (aux) {  
                aux=false;
                numero=(int)(random.nextDouble()*11-1);
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j]==numero) {
                        aux=true;
                        break;
                    }
                }
            }
            numeros[x]=numero;
        }
        return numeros;
    }
    
    
    public void fillSpaces() 
    {
        String abc[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                if (letter[i][j].getText().equals("")) {
                    letter[i][j].setText(abc[(int)(random.nextDouble()*abc.length-1)]);
                }
            }
        }
    }
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		new AlphabetJframe().setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlphabetJframe frame = new AlphabetJframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
    javax.swing.JPanel Sopa_de_letra;
    javax.swing.JPanel Principal;
    javax.swing.JDesktopPane escritorio;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JLabel p1;
    javax.swing.JLabel p10;
    javax.swing.JLabel p2;
    javax.swing.JLabel p3;
    javax.swing.JLabel p4;
    javax.swing.JLabel p5;
    javax.swing.JLabel p6;
    javax.swing.JLabel p7;
    javax.swing.JLabel p8;
    javax.swing.JLabel p9;
}
