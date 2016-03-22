import javax.swing.JOptionPane;
public class EnumSwitchLoop {
	public enum MonthChoices {DecemberThroughFebruary, MarchThroughMay, JuneThroughAugust, SeptemberThroughNovember}
	public static void main(String [] args) {
		MonthChoices[] Months = {MonthChoices.DecemberThroughFebruary, MonthChoices.MarchThroughMay, MonthChoices.JuneThroughAugust, MonthChoices.SeptemberThroughNovember};
		MonthChoices Selection = (MonthChoices)JOptionPane.showInputDialog(null, "Please choose one.", "Month Options", JOptionPane.PLAIN_MESSAGE, null, Months, Months[0]);
		
		while(Selection!=null) {
			switch(Selection) {
				case DecemberThroughFebruary:
					JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
					break;
				case MarchThroughMay:
					JOptionPane.showMessageDialog(null, "Happy Spring Days!");
					break;
				case JuneThroughAugust:
					JOptionPane.showMessageDialog(null, "It's summer time!");
					break;
				case SeptemberThroughNovember:
					JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
					break;
				}
				Selection = (MonthChoices) JOptionPane.showInputDialog(null, "Please choose one.", "Month Options", JOptionPane.PLAIN_MESSAGE, null, Months, Months[0]);
				
		}
	}
}
