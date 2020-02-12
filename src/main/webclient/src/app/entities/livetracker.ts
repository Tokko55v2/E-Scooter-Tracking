export class Livetracker {
  constructor(id: string, scscooterCounter: number, timestamp: any) {
    this.id = id;
    this.scooterCounter = scscooterCounter;
    this.timestamp = timestamp;
  }
  id: string;
  scooterCounter: number;
  timestamp: any;
}
