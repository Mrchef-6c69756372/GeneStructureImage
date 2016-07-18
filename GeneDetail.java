import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GeneDetail {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				drawGene();
			}
		});
	}


	private static void drawGene() {
		HashMap<String, List> localtion = new HashMap();
		// 获取Graphics2D
		List<Integer> id = new ArrayList<Integer>();
		List<Integer> id1 = new ArrayList<Integer>();
		List<String> Classifyid = new ArrayList<String>();
		List<String> Classifyid1 = new ArrayList<String>();
		List<String> p_coding = new ArrayList<String>();
		List<String> p_coding1 = new ArrayList<String>();
		List<Integer> start = new ArrayList<Integer>();
		List<Integer> Instart = new ArrayList<Integer>();
		List<Integer> end = new ArrayList<Integer>();
		List<Integer> Inend = new ArrayList<Integer>();
		List<String> ori = new ArrayList<String>();
		List<String> ori1 = new ArrayList<String>();
		List<String> Transcript = new ArrayList<String>();
		List<String> Transcript1 = new ArrayList<String>();
		List<String> Codonstr = new ArrayList<String>();
		List<String> name = new ArrayList<String>();
		List<String> geneID = new ArrayList<String>();
		List<String> geneID1 = new ArrayList<String>();
		List<Integer> line = new ArrayList<Integer>();
		List<Integer> loc = new ArrayList<Integer>();
		List<Integer> line1 = new ArrayList<Integer>();
		List<Integer> loc1 = new ArrayList<Integer>();
		List<String> key = new ArrayList<String>();
		id.add(522);
		id.add(523);
		id.add(524);
		id.add(525);
		id.add(526);
		id.add(527);
		id.add(528);
		id.add(529);

		id.add(506);
		id.add(507);
		id.add(508);
		id.add(509);
		id.add(510);
		id.add(511);
		id.add(512);
		id.add(513);
		id.add(514);
		id.add(515);
		id.add(516);
		id.add(517);
		id.add(518);
		id.add(519);
		id.add(520);
		id.add(521);

		id1.add(459585);
		id1.add(459586);
		id1.add(459587);

		id1.add(459578);
		id1.add(459579);
		id1.add(459580);
		id1.add(459581);
		id1.add(459582);
		id1.add(459583);
		id1.add(459584);
		Classifyid1.add("1");
		Classifyid1.add("1");
		Classifyid1.add("1");

		Classifyid1.add("1");
		Classifyid1.add("1");
		Classifyid1.add("1");
		Classifyid1.add("1");
		Classifyid1.add("1");
		Classifyid1.add("1");
		Classifyid1.add("1");

		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");

		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		Classifyid.add("1");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");

		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding.add("exon");
		p_coding.add("CDS");
		p_coding1.add("intron");
		p_coding1.add("intron");
		p_coding1.add("intron");

		p_coding1.add("intron");
		p_coding1.add("intron");
		p_coding1.add("intron");
		p_coding1.add("intron");
		p_coding1.add("intron");
		p_coding1.add("intron");
		p_coding1.add("intron");
		start.add(3739374);
		start.add(3739374);
		start.add(3739487);
		start.add(3739487);
		start.add(3740707);
		start.add(3740707);
		start.add(3741246);
		start.add(3741246);

		start.add(3716401);
		start.add(3716531);
		start.add(3725339);
		start.add(3725339);
		start.add(3726270);
		start.add(3726270);
		start.add(3727431);
		start.add(3727431);
		start.add(3728432);
		start.add(3728432);
		start.add(3730072);
		start.add(3730072);
		start.add(3731337);
		start.add(3731337);
		start.add(3732627);
		start.add(3732627);

		Instart.add(3739466);
		Instart.add(3739550);
		Instart.add(3741001);

		Instart.add(3716594);
		Instart.add(3725426);
		Instart.add(3726353);
		Instart.add(3727513);
		Instart.add(3728468);
		Instart.add(3730131);
		Instart.add(3731367);

		end.add(3739465);
		end.add(3739465);
		end.add(3739549);
		end.add(3739549);
		end.add(3741000);
		end.add(3741000);
		end.add(3741687);
		end.add(3741687);

		end.add(3716593);
		end.add(3716593);
		end.add(3725425);
		end.add(3725425);
		end.add(3726352);
		end.add(3726352);
		end.add(3727512);
		end.add(3727512);
		end.add(3728467);
		end.add(3728467);
		end.add(3730130);
		end.add(3730130);
		end.add(3731366);
		end.add(3731366);
		end.add(3734041);
		end.add(3732663);

		Inend.add(3739486);
		Inend.add(3740706);
		Inend.add(3741245);

		Inend.add(3725338);
		Inend.add(3726269);
		Inend.add(3727430);
		Inend.add(3728431);
		Inend.add(3730071);
		Inend.add(3731336);
		Inend.add(3732626);

		ori.add("+");
		ori.add("+");
		ori.add("+");
		ori.add("+");
		ori.add("+");
		ori.add("+");
		ori.add("+");
		ori.add("+");

		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");
		ori.add("-");

		ori1.add("+");
		ori1.add("+");
		ori1.add("+");

		ori1.add("-");
		ori1.add("-");
		ori1.add("-");
		ori1.add("-");
		ori1.add("-");
		ori1.add("-");
		ori1.add("-");
		Transcript.add("ENSSSCT00000004446");
		Transcript.add("ENSSSCT00000004446");
		Transcript.add("ENSSSCT00000004446");
		Transcript.add("ENSSSCT00000004446");
		Transcript.add("ENSSSCT00000004446");
		Transcript.add("ENSSSCT00000004446");
		Transcript.add("ENSSSCT00000004446");
		Transcript.add("ENSSSCT00000004446");

		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");
		Transcript.add("ENSSSCT00000004445");

		Transcript1.add("ENSSSCT00000004446");
		Transcript1.add("ENSSSCT00000004446");
		Transcript1.add("ENSSSCT00000004446");

		Transcript1.add("ENSSSCT00000004445");
		Transcript1.add("ENSSSCT00000004445");
		Transcript1.add("ENSSSCT00000004445");
		Transcript1.add("ENSSSCT00000004445");
		Transcript1.add("ENSSSCT00000004445");
		Transcript1.add("ENSSSCT00000004445");
		Transcript1.add("ENSSSCT00000004445");

		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");

		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");
		Codonstr.add("1");

		name.add("PRR18");
		name.add("PRR18");
		name.add("PRR18");
		name.add("PRR18");
		name.add("PRR18");
		name.add("PRR18");
		name.add("PRR18");
		name.add("PRR18");

		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");
		name.add("SFT2D1");

		geneID.add("ENSSSCG00000004021");
		geneID.add("ENSSSCG00000004021");
		geneID.add("ENSSSCG00000004021");
		geneID.add("ENSSSCG00000004021");
		geneID.add("ENSSSCG00000004021");
		geneID.add("ENSSSCG00000004021");
		geneID.add("ENSSSCG00000004021");
		geneID.add("ENSSSCG00000004021");

		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");
		geneID.add("ENSSSCG00000004020");

		geneID1.add("ENSSSCG00000004021");
		geneID1.add("ENSSSCG00000004021");
		geneID1.add("ENSSSCG00000004021");

		geneID1.add("ENSSSCG00000004020");
		geneID1.add("ENSSSCG00000004020");
		geneID1.add("ENSSSCG00000004020");
		geneID1.add("ENSSSCG00000004020");
		geneID1.add("ENSSSCG00000004020");
		geneID1.add("ENSSSCG00000004020");
		geneID1.add("ENSSSCG00000004020");

		line.add(1);
		line.add(1);
		line.add(1);
		line.add(1);
		line.add(1);
		line.add(1);
		line.add(1);
		line.add(1);

		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);
		line.add(2);

		loc.add(3739374);
		loc.add(3739374);
		loc.add(3739374);
		loc.add(3739374);
		loc.add(3739374);
		loc.add(3739374);
		loc.add(3739374);
		loc.add(3739374);

		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);
		loc.add(3716401);

		line1.add(1);
		line1.add(1);
		line1.add(1);

		line1.add(2);
		line1.add(2);
		line1.add(2);
		line1.add(2);
		line1.add(2);
		line1.add(2);
		line1.add(2);

		loc1.add(3739374);
		loc1.add(3739374);
		loc1.add(3739374);

		loc1.add(3716401);
		loc1.add(3716401);
		loc1.add(3716401);
		loc1.add(3716401);
		loc1.add(3716401);
		loc1.add(3716401);
		loc1.add(3716401);
		double height;
		for (int i = 0; i < id.size(); i++) {
			ExtronAndIntron2 tempExIntron = new ExtronAndIntron2(id.get(i),
					Classifyid.get(i), p_coding.get(i), start.get(i),
					end.get(i), ori.get(i), Transcript.get(i), Codonstr.get(i),
					1, name.get(i), geneID.get(i), start.get(i), line.get(i),
					loc.get(i));
			if (localtion.containsKey(Transcript.get(i))) {
				localtion.get(Transcript.get(i)).add(tempExIntron);
			} else {
				localtion.put(Transcript.get(i), new ArrayList());
				localtion.get(Transcript.get(i)).add(tempExIntron);
			}
		}

		for (int i = 0; i < id1.size(); i++) {
			ExtronAndIntron2 tempExIntron = new ExtronAndIntron2(id1.get(i),
					Classifyid1.get(i), p_coding1.get(i), Instart.get(i),
					Inend.get(i), ori1.get(i), Transcript1.get(i), "", 0, "",
					geneID1.get(i), 0, line1.get(i), loc1.get(i));
			if (localtion.containsKey(Transcript1.get(i))) {
				localtion.get(Transcript1.get(i)).add(tempExIntron);
			} else {
				localtion.put(Transcript1.get(i), new ArrayList());
				localtion.get(Transcript1.get(i)).add(tempExIntron);
			}
		}
		Iterator itEx = localtion.entrySet().iterator();
		while (itEx.hasNext()) {
			Map.Entry entry = (Map.Entry) itEx.next();
			key.add((String) entry.getKey());
		}
		// System.out.println(localtion.get(key.get(1)).size());
		BufferedImage image = new BufferedImage(1000, 600,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = image.createGraphics();
		image = g2.getDeviceConfiguration().createCompatibleImage(1000, 200,
				Transparency.TRANSLUCENT);

		g2.dispose();

		g2 = image.createGraphics();
		double zoom = (1000) / (3748376.0 - 3712376.0);
		// System.out.println(((ExtronAndIntron2)
		// localtion.get(key.get(n)).get(0)));
		try {
			for (int n = 0; n < key.size(); n++) {
				for (int i = 0; i < localtion.get(key.get(n)).size(); i++) {
					if (((ExtronAndIntron2) localtion.get(key.get(n)).get(i))
							.getFlag() == 1) {

						double leftX = ((double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getStart() - 3712376)
								* zoom;// 左上点＋宽高
						double topY = (double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getLine_num();
						double width = ((double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getEnd() * zoom - (double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getStart() * zoom);

						Font f = new Font("swift.TTF", Font.PLAIN, 10);
						String geneName = ((ExtronAndIntron2) localtion.get(
								key.get(n)).get(i)).getGeneName();
						double name_localtion = ((double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getName_local() - 3712376)
								* zoom;
						// System.out.println(leftX);
						g2.setColor(Color.blue);
						if (((ExtronAndIntron2) localtion.get(key.get(n))
								.get(i)).getProtein_coding().equals("exon")) {
							height = 5;

							Rectangle2D rect = new Rectangle2D.Double(leftX,
									topY * 15 + 3, width, height);
							g2.fill(rect);
						} else {
							height = 10;

							Rectangle2D rect = new Rectangle2D.Double(leftX,
									topY * 15, width, height);
							g2.fill(rect);
						}

						g2.setFont(f);
						g2.drawString(geneName, (int) name_localtion - 35,
								(int) topY * 15 + 9);
					} else if (((ExtronAndIntron2) localtion.get(key.get(n))
							.get(i)).getFlag() == 0) {
						double startX = ((double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getStart() - 3712376)
								* zoom;
						double startY = (double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getLine_num();
						double endX = ((double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getEnd() - 3712376)
								* zoom;
						double endY = (double) ((ExtronAndIntron2) localtion
								.get(key.get(n)).get(i)).getLine_num();
						// System.out.println((double)((ExtronAndIntron2)
						// localtion.get(
						// key.get(n)).get(i)).getStart());
						// System.out.println(startX);
						Line2D arrow = new Line2D.Double(startX,
								startY * 15 + 5, endX, endY * 15 + 5);
						g2.draw(arrow);
						g2.setColor(Color.blue);

						int lineWidth = (int) (endX - startX);
						if ((((ExtronAndIntron2) localtion.get(key.get(n)).get(
								i)).getOrientation()).equals("+")) {
							for (int j = 0; j <= lineWidth / 6; j++) {
								int midX = (int) startX + 6 * j;
								int[] xPoints = { (int) midX - 3, (int) midX,
										(int) midX - 3 };
								int[] yPoints = { (int) (startY * 15 + 3),
										(int) (startY * 15 + 5),
										(int) (startY * 15 + 7) };
								g2.drawPolyline(xPoints, yPoints, 3);
							}
						} else {
							for (int j = 0; j <= lineWidth / 6; j++) {
								int midX = (int) startX + 6 * j;
								int[] xPoints = { (int) midX + 3, (int) midX,
										(int) midX + 3 };
								int[] yPoints = { (int) (startY * 15 + 3),
										(int) (startY * 15 + 5),
										(int) (startY * 15 + 7) };
								g2.drawPolyline(xPoints, yPoints, 3);
							}
						}

					}
				}
			}
			g2.dispose();
			ImageIO.write(image, "png", new File(
					"/Users/peterliu1/Desktop/test.png"));
		}
		// draw outter rectangle
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	//private static final long serialVersionUID = 1L;
}
