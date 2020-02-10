import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TierMapComponent } from './tier-map.component';

describe('TierMapComponent', () => {
  let component: TierMapComponent;
  let fixture: ComponentFixture<TierMapComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TierMapComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TierMapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
