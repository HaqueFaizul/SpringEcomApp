import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserloginComponent } from './userlogin/userlogin.component';
import { GetAllProductComponent } from './product/get-all-product/get-all-product.component';
import myAppConfig from './config/my-app-config';
import { OktaAuth } from '@okta/okta-auth-js';
import { OktaCallbackComponent, OktaAuthModule } from '@okta/okta-angular';
const oktaConfig=myAppConfig.oidc;
const oktaAuth=new OktaAuth(oktaConfig);

const routes: Routes = [
  {path:"product",component:GetAllProductComponent},
  {path:"login/callback",component:OktaCallbackComponent},
  {path:"login",component:UserloginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    OktaAuthModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
