package org.idea.shower.admin.dto;

import org.idea.shower.db.domain.showerGoods;
import org.idea.shower.db.domain.showerGoodsAttribute;
import org.idea.shower.db.domain.showerGoodsProduct;
import org.idea.shower.db.domain.showerGoodsSpecification;

public class GoodsAllinone {
    showerGoods goods;
    showerGoodsSpecification[] specifications;
    showerGoodsAttribute[] attributes;
    showerGoodsProduct[] products;

    public showerGoods getGoods() {
        return goods;
    }

    public void setGoods(showerGoods goods) {
        this.goods = goods;
    }

    public showerGoodsProduct[] getProducts() {
        return products;
    }

    public void setProducts(showerGoodsProduct[] products) {
        this.products = products;
    }

    public showerGoodsSpecification[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(showerGoodsSpecification[] specifications) {
        this.specifications = specifications;
    }

    public showerGoodsAttribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(showerGoodsAttribute[] attributes) {
        this.attributes = attributes;
    }

}
