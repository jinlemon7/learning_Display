 public class WebUIFactory implements UIFactory {
     @Override
     public Button createButton() {
         return new WebButton();
     }
 
     @Override
     public TextBox createTextBox() {
         return new WebTextBox();
     }
 
     @Override
     public Image createImage() {
         return new WebImage();
     }
 }