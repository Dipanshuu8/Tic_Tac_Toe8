import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b; 
	String s1="1",s2="2",s3="3",s4="4",s5="5",s6="6",s7="7",s8="8",s9="9";	
	int i=1; 
	boolean c1=true,c2=true,c3=true,c4=true,c5=true,c6=true,c7=true,c8=true,c9=true; 
	boolean a=true;
	Fdemo()
	{
		setLayout(null);
		setFont(new Font("Agency FB",Font.BOLD,30));
		b1=new Button();
		b1.setSize(100,100);
		b1.setLocation(100,100);
		b1.setBackground(Color.red);
		add(b1);

		b2=new Button();
		b2.setSize(100,100);
		b2.setLocation(200,100);
		b2.setBackground(Color.green);
		add(b2);
		
		b3=new Button();
		b3.setSize(100,100);
		b3.setLocation(300,100);
		b3.setBackground(Color.yellow);
		add(b3);
		
		b4=new Button();
		b4.setSize(100,100);
		b4.setLocation(100,200);
		b4.setBackground(Color.cyan);
		add(b4);
		
		b5=new Button();
		b5.setSize(100,100);
		b5.setLocation(200,200);
		b5.setBackground(Color.white);
		add(b5);
		
		b6=new Button();
		b6.setSize(100,100);
		b6.setLocation(300,200);
		b6.setBackground(Color.magenta);
		add(b6);
		
		b7=new Button();
		b7.setSize(100,100);
		b7.setLocation(100,300);
		b7.setBackground(Color.blue);
		add(b7);
		
		b8=new Button();
		b8.setSize(100,100);
		b8.setLocation(200,300);
		b8.setBackground(Color.gray);
		add(b8);
		
		b9=new Button();
		b9.setSize(100,100);
		b9.setLocation(300,300);
		b9.setBackground(Color.orange);
		add(b9);
//winner declare Button		
		b=new Button();
		b.setSize(200,100);
		b.setLocation(400,200);
		b.setBackground(Color.green);
		add(b);

		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(a==true)
		{	
			if((e.getSource()==b1)&&c1==true)
			{
				if(i%2==1)
				{
				b1.setLabel("X");
				}
			else if(i%2==0)
				{
				b1.setLabel("0");
				}
				s1=b1.getLabel();
				c1=false;
				i++;
			}				
			
			if(e.getSource()==b2&&c2==true)
			{
				if(i%2==1)
				{
				b2.setLabel("X");
				}
			else if(i%2==0)
				{
				b2.setLabel("0");
				}
				s2=b2.getLabel();
				c2=false;
				i++;
			}
			if(e.getSource()==b3&&c3==true)
			{
				
				if(i%2==1)
				{
				b3.setLabel("X");
				}
			else if(i%2==0)
				{
				b3.setLabel("0");
				}
				s3=b3.getLabel();	
				c3=false;
				i++;
			}
			if(e.getSource()==b4&&c4==true)
			{
				
				if(i%2==1)
				{
				b4.setLabel("X");
				}
			else if(i%2==0)
				{
				b4.setLabel("0");
				}
				s4=b4.getLabel();	
				c4=false;
				i++;
			}
			if(e.getSource()==b5&&c5==true)
			{
				if(i%2==1)
				{
				b5.setLabel("X");
				}
			else if(i%2==0)
				{
				b5.setLabel("0");
				}
				s5=b5.getLabel();	
				c5=false;
				i++;
			}
			if(e.getSource()==b6&&c6==true)
			{
				
				if(i%2==1)
				{
				b6.setLabel("X");
				}
			else if(i%2==0)
				{
				b6.setLabel("0");
				}
				s6=b6.getLabel();	
				c6=false;
				i++;
			}
			if(e.getSource()==b7&&c7==true)
			{
				
				if(i%2==1)
				{
				b7.setLabel("X");
				}
			else if(i%2==0)
				{
				b7.setLabel("0");
				}
				s7=b7.getLabel();
				c7=false;
				i++;
			}
			if(e.getSource()==b8&&c8==true)
			{
				
				if(i%2==1)
				{
				b8.setLabel("X");
				}
			else if(i%2==0)
				{
				b8.setLabel("0");
				}
				s8=b8.getLabel();	
				c8=false;
				i++;
			}
			if(e.getSource()==b9&&c9==true)
			{
				
				if(i%2==1)
				{
				b9.setLabel("X");
				}
			else if(i%2==0)
				{
				b9.setLabel("0");
				}
				s9=b9.getLabel();
				c9=false;
				i++;
			}
		}
		//horizontally
		
		if((s1==s2)&&(s2==s3))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s1);
		}
		else if((s4==s5)&&(s5==s6))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s4);
		}
		else if((s7==s8)&&(s8==s9))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s7);
		}
		//vertically
		else if((s1==s4)&&(s4==s7))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s1);
		}
		else if((s2==s5)&&(s5==s8))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s2);
		}
		else if((s3==s6)&&(s6==s9))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s3);
		}
		//diagonally
		else if((s1==s5)&&(s5==s9))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s1);
		}
		else if((s3==s5)&&(s5==s7))
		{
			a=false;
			System.out.println("winner");
			b.setLabel("winner is "+s3);
		}
		else if(i>9)
		{
			a=false;
			System.out.println("winner");
			b.setLabel("game is draw");
		}
	}
	
}

class tic8
{
	public static void main(String ar[])
	{
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(300,100);
		f.setResizable(false);
		f.setBackground(Color.pink);
	}
}
