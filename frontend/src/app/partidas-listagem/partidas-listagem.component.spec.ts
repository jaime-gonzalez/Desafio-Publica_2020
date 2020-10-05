import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PartidasListagemComponent } from './partidas-listagem.component';

describe('PartidasListagemComponent', () => {
  let component: PartidasListagemComponent;
  let fixture: ComponentFixture<PartidasListagemComponent>;

  beforeEach(async (() => {
    TestBed.configureTestingModule({
      declarations: [ PartidasListagemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PartidasListagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
