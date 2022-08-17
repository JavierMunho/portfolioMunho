import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HysskillComponent } from './hysskill.component';

describe('HysskillComponent', () => {
  let component: HysskillComponent;
  let fixture: ComponentFixture<HysskillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HysskillComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HysskillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
