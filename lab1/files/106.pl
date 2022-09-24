while (<>) {
  print if /\b([1-9](\d)*)+\b/;
}
