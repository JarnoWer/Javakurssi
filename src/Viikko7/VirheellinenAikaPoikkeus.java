package Viikko7;

/** VirheellinenAikaPoikkeus perii RuntimeException-luokan,
 * eli sit‰ voidaan k‰ytt‰‰ ajonaikaisena poikkeuksena: */
public class VirheellinenAikaPoikkeus extends RuntimeException {

   public VirheellinenAikaPoikkeus(String virheviesti) {

       // Annetaan virheilmoitus eteenp‰in yl‰luokan konstruktorille
       super(virheviesti);

   }
}