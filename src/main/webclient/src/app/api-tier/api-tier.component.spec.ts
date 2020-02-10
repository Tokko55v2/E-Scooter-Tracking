import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApiTierComponent } from './api-tier.component';

describe('ApiTierComponent', () => {
  let component: ApiTierComponent;
  let fixture: ComponentFixture<ApiTierComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApiTierComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApiTierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
