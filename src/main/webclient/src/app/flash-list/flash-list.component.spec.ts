import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FlashListComponent } from './flash-list.component';

describe('FlashListComponent', () => {
  let component: FlashListComponent;
  let fixture: ComponentFixture<FlashListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FlashListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FlashListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
