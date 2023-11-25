import { Component } from '@angular/core';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-get-all-product',
  templateUrl: './get-all-product.component.html',
  styleUrls: ['./get-all-product.component.css']
})
export class GetAllProductComponent {
  products:any=[]
  constructor(private productService: ProductService ){}

  ngOnInit()
  {
    this.listProduct();
  }

  listProduct()
  {
    this.productService.getProductList().subscribe((res)=>{
      console.log(res)
      this.products=res;
    })
  }
}
