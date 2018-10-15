import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'SocketAngularWeb';
  resource = {};
  greeting = {};
  test = '';
  constructor(private http: HttpClient) {
    http.get('api/greeting').subscribe(data => this.greeting = data);
    http.get('api/resource').subscribe(data => this.resource = data);
    http.get('api/test',{responseType: 'text'}).subscribe(data => this.test = data);
  }
}


