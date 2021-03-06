package cbis

class Shop {
    String shopName
    String address
    User user
    String description
    String shopLogoUrl
    static belongsTo=User
    static hasMany=[goods:Goods,shopTags:ShopTag,ads:Ad]
    static constraints = {
        shopName(size:2..20,blank:false)
        address(maxSize:200,blank:false)
    }
    String toString(){
        shopName
    }
}
