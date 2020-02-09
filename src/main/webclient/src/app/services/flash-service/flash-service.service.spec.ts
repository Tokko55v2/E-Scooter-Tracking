import { TestBed } from '@angular/core/testing';

import { FlashServiceService } from './flash-service.service';

describe('FlashServiceService', () => {
  let service: FlashServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FlashServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
