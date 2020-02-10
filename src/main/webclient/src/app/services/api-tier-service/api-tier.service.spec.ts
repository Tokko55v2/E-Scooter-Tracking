import { TestBed } from '@angular/core/testing';

import { ApiTierService } from './api-tier.service';

describe('ApiTierService', () => {
  let service: ApiTierService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiTierService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
