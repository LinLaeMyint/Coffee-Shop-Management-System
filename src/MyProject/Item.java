
package MyProject;
public class Item {
    String id;
    String itemName;
    int price;
    int qty;
    

    public Item(String id,String itemName,int price,int qty) {
       this.id=id;
        this.itemName = itemName;
        this.price = price;
        this.qty=qty;
    }

    Item(String item, String extra, String size, int price, int qty) {
       this.itemName=item;
       this.price=price;
       this.qty=qty;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
   return  getId()+"\t"+getItemName()+"\t"+getPrice()+"\t"+getQty();
   }
    
    
}
