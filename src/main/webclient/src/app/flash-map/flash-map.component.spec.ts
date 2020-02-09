import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FlashMapComponent } from './flash-map.component';

describe('FlashMapComponent', () => {
  let component: FlashMapComponent;
  let fixture: ComponentFixture<FlashMapComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FlashMapComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FlashMapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
