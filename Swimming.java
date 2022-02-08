	
	import java.awt.*;
	import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

import javax.swing.*;


	public class Lab2C_Mandryk_Main {
		
		
		public static int r1=0,r2=0,r3=0,r4=0;
		public static int g1=0,g2=0,g3=0,g4=0;
		public static int b1=0,b2=0,b3=0,b4=0;
		public static long BEndTime=0, REndTime=0, GEndTime=0;
		public static Random r = new Random();
		
		public static boolean isGone() {
			return r.nextInt(100000)==228?true:false;
		}
		
		public static void main(String[] args) {
			
			
			Random r = new Random();
			JFrame fr = new JFrame("Swim | Made by @ilya_mandryk");
			fr.setPreferredSize(new Dimension(700, 500));
			final JPanel pan = new JPanel();
			fr.add(pan);
			fr.setResizable(false);
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fr.pack();
			
			CountDownLatch latch = new CountDownLatch(3);
			
			Thread fourthRedPlayer = new Thread(new Runnable() {
				@SuppressWarnings("deprecation")
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						 r4++;
						 if(isGone()) {
							 latch.countDown();
							 Thread.currentThread().stop();
						 }
						  try {
						        Thread.sleep(r.nextInt(120));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 REndTime = System.currentTimeMillis(); 
					 latch.countDown();
				}
				
	    	});
			
			Thread thirdRedPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						  r3++;
						  if(isGone()) {
								 latch.countDown();
								 Thread.currentThread().stop();
							 }
						  try {
						        Thread.sleep(r.nextInt(80));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 fourthRedPlayer.resume();
				}
	    	});
			
			Thread secondRedPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						 r2++;
						 if(isGone()) {
							 latch.countDown();
							 Thread.currentThread().stop();
						 }
						  try {
						        Thread.sleep(r.nextInt(70));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 thirdRedPlayer.resume();
				}
				
	    	});
			
			Thread firsRedPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						  r1++;
						  if(isGone()) {
								 latch.countDown();
								 Thread.currentThread().stop();
							 }
						  try {
						        Thread.sleep(r.nextInt(130));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 secondRedPlayer.resume();
				}
	    	});
			
			Thread fourthGrPlayer = new Thread(new Runnable() {
				@SuppressWarnings("deprecation")
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						 g4++;
						 if(isGone()) {
							 latch.countDown();
							 Thread.currentThread().stop();
						 }
						  try {
						        Thread.sleep(r.nextInt(120));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 GEndTime = System.currentTimeMillis(); 
					 latch.countDown();
				}
				
	    	});
			
			Thread thirdGrPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						  g3++;
						  if(isGone()) {
								 latch.countDown();
								 Thread.currentThread().stop();
							 }
						  try {
						        Thread.sleep(r.nextInt(130));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 fourthGrPlayer.resume();
				}
	    	});
			
			Thread secondGrPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						 g2++;
						 if(isGone()) {
							 latch.countDown();
							 Thread.currentThread().stop();
						 }
						  try {
						        Thread.sleep(r.nextInt(70));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 thirdGrPlayer.resume();
				}
				
	    	});
			
			Thread firsGrPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						  g1++;
						  if(isGone()) {
								 latch.countDown();
								 Thread.currentThread().stop();
							 }
						  try {
						        Thread.sleep(r.nextInt(80));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 secondGrPlayer.resume();
				}
	    	});
			
			Thread fourthBlPlayer = new Thread(new Runnable() {
				@SuppressWarnings("deprecation")
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						 b4++;
						 if(isGone()) {
							 latch.countDown();
							 Thread.currentThread().stop();
						 }
						  try {
						        Thread.sleep(r.nextInt(90));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 BEndTime = System.currentTimeMillis();
					 latch.countDown();
				}
				
	    	});
			
			Thread thirdBlPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						  b3++;
						  if(isGone()) {
								 latch.countDown();
								 Thread.currentThread().stop();
							 }
						  try {
						        Thread.sleep(r.nextInt(120));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 fourthBlPlayer.resume();
				}
	    	});
			
			Thread secondBlPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						 b2++;
						 if(isGone()) {
							 latch.countDown();
							 Thread.currentThread().stop();
						 }
						  try {
						        Thread.sleep(r.nextInt(90));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 thirdBlPlayer.resume();
				}
				
	    	});
			
			Thread firsBlPlayer = new Thread(new Runnable() {
				@SuppressWarnings({ "removal", "deprecation" })
				@Override
				public void run() {
					 for(int j=0; j<500; j++) {
						  b1++;
						  if(isGone()) {
								 latch.countDown();
								 Thread.currentThread().stop();
							 }
						  try {
						        Thread.sleep(r.nextInt(100));
						    } catch (InterruptedException e1) {
						        e1.printStackTrace();
						    }
					  }
					 secondBlPlayer.resume();
				}
	    	});
			
			Thread arbiter = new Thread(new Runnable() {
				@SuppressWarnings("removal")
				@Override
				public void run() {
					long startTime = System.currentTimeMillis();
					firsRedPlayer.start();
					firsGrPlayer.start();
					firsBlPlayer.start();
					
					secondRedPlayer.start();
					secondGrPlayer.start();
					secondBlPlayer.start();
					secondRedPlayer.suspend();
					secondGrPlayer.suspend();
					secondBlPlayer.suspend();
					
					thirdRedPlayer.start();
					thirdGrPlayer.start();
					thirdBlPlayer.start();
					thirdRedPlayer.suspend();
					thirdGrPlayer.suspend();
					thirdBlPlayer.suspend();
					
					fourthRedPlayer.start();
					fourthGrPlayer.start();
					fourthBlPlayer.start();
					fourthRedPlayer.suspend();
					fourthGrPlayer.suspend();
					fourthBlPlayer.suspend();
					
					try {
						latch.await();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ArrayList <String>res=new ArrayList<String>();
					if((GEndTime-startTime)>0)res.add("Время команды: "+ Integer.toString((int)(GEndTime-startTime)/60000) +":"
						+	Integer.toString((int)((GEndTime-startTime)/1000)%60) + "." + ((GEndTime-startTime)%1000) + " - Зелёные");
					else System.out.println("Зелёные сошли с дистанции");
					if((REndTime-startTime)>0)res.add("Время команды: "+ Integer.toString((int)(REndTime-startTime)/60000) +":"
							+	Integer.toString((int)((REndTime-startTime)/1000)%60) + "." + ((REndTime-startTime)%1000) + " - Красные");
					else System.out.println("Красные сошли с дистанции");
					if((BEndTime-startTime)>0)res.add("Время команды: "+ Integer.toString((int)(BEndTime-startTime)/60000) +":"
							+	Integer.toString((int)((BEndTime-startTime)/1000)%60) + "." + ((BEndTime-startTime)%1000)+ " - Синие");
					else System.out.println("Синие сошли с дистанции");
					Collections.sort(res);
					for(int i=0;i<res.size();i++) {
						System.out.println((i+1)+" Mесто - " + res.get(i));
					}
				}
				
	    	});
			
			
			
			
			JButton startButton = new JButton("Начать заплыв");
			pan.add(startButton);
			startButton.setBounds(100, 140, 500, 50);
			startButton.addActionListener((ActionListener) new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					arbiter.start();
					startButton.setEnabled(false);
				}
				
		    });

			Timer tm = new Timer(80, new ActionListener() {
				
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Graphics2D gr = (Graphics2D) pan.getRootPane().getGraphics();
					pan.update(gr);
					int rx1 = 80 + r1, ry1 = 120;
					int rx3 = 80 + r3, ry3 = 140;
					int rx2 = 600 - r2, ry2 = 120;
					int rx4 = 600 - r4, ry4 = 140;
					
					int gx1 = 80 + g1, gy1 = 220;
					int gx3 = 80 + g3, gy3 = 240;
					int gx2 = 600 - g2, gy2 = 220;
					int gx4 = 600 - g4, gy4 = 240;
					
					int bx1 = 80 + b1, by1 = 320;
					int bx3 = 80 + b3, by3 = 340;
					int bx2 = 600 - b2, by2 = 320;
					int bx4 = 600 - b4, by4 = 340;
					
					gr.setColor(Color.BLACK);
					
					gr.drawLine(100, 100, 600, 100);
					gr.drawLine(100, 100, 100, 400);
					gr.drawLine(600, 100, 600, 400);
					gr.drawLine(100, 400, 600, 400);
					gr.drawLine(100, 200, 600, 200);
					gr.drawLine(100, 300, 600, 300);
					
					gr.setColor(Color.black);
					gr.drawOval(240, 50, 20, 20);
					gr.drawString("C", 245, 65);
					
					//RedTeam
					gr.setColor(Color.red);
					gr.drawOval(rx1, ry1, 20, 20);
					gr.drawString("1", rx1+5, ry1+15);
					
				
					gr.drawOval(rx3, ry3, 20, 20);
					gr.drawString("3", rx3+5, ry3+15);
					
					gr.drawOval(rx2, ry2, 20, 20);
					gr.drawString("2", rx2+5, ry2+15);

					gr.drawOval(rx4, ry4, 20, 20);
					gr.drawString("4", rx4+5, ry4+15);
					
					//GreenTeam
					gr.setColor(Color.green);
					gr.drawOval(gx1, gy1, 20, 20);
					gr.drawString("1", gx1+5, gy1+15);
					
					
					gr.drawOval(gx3, gy3, 20, 20);
					gr.drawString("3", gx3+5, gy3+15);
					
					gr.drawOval(gx2, gy2, 20, 20);
					gr.drawString("2", gx2+5, gy2+15);

					gr.drawOval(gx4, gy4, 20, 20);
					gr.drawString("4", gx4+5, gy4+15);
					
					//BlueTeam
					gr.setColor(Color.blue);
					gr.drawOval(bx1, by1, 20, 20);
					gr.drawString("1", bx1+5, by1+15);
					
					
					gr.drawOval(bx3, by3, 20, 20);
					gr.drawString("3", bx3+5, by3+15);
					
					gr.drawOval(bx2, by2, 20, 20);
					gr.drawString("2", bx2+5, by2+15);

					gr.drawOval(bx4, by4, 20, 20);
					gr.drawString("4", bx4+5, by4+15);
					
					
					
				}
			});
			tm.start();
		}
	}


