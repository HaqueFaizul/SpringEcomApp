import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { GetAllProductComponent } from './product/get-all-product/get-all-product.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { LoginStatusComponent } from './login-status/login-status.component';

import {
  OktaAuthModule,
  OktaCallbackComponent,
  OKTA_CONFIG,
} from '@okta/okta-angular';

import { OktaAuth } from '@okta/okta-auth-js';

import myAppConfig from './config/my-app-config';
import { RouterModule, Routes } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { ProductService } from './services/product.service';

const oktaConfig=myAppConfig.oidc;
const oktaAuth=new OktaAuth(oktaConfig);

const routes:Routes=[
  {path:"login/callback",component:OktaCallbackComponent},
  {path:"login",component:UserloginComponent},
]
@NgModule({
  declarations: [
    AppComponent,
    GetAllProductComponent,
    UserloginComponent,
    LoginStatusComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    OktaAuthModule,
  ],
  providers: [ProductService,{provide:OKTA_CONFIG,useValue:{oktaAuth}}],
  bootstrap: [AppComponent]
})
export class AppModule { }
