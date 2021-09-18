### Better Super Flat

Usage:
Select the `BetterSuperFlat`generation option in the create world screen.

If you do not have Fabric API it will show up as `generator.BetterSuperFlat` instead of
`BetterSuperFlat`

Does the following:

- Void in all three dimensions
- Has all the biomes and structure bounding boxes of vanilla generation included
- Overworld generates glass floor with outlines for chunks
  
  ![floor](screenshots/Floor.png?raw=true "Floor")

Problems:
- Currently doesnt change the gamerules to default to good ones
- Player spawns at y63 not y1
- Everything below y 63 is dark because of the sea level is as in vanilla