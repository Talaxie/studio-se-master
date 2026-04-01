#!/usr/bin/perl
# lists the plugins in a given eclipse launch file.
# 2009-12-03


$which_plugins='selected_target_plugins';
# $which_plugins='selected_workspace_plugins';

open(my $ifh, '<'.$ARGV[0]) or die 'file does not exist, yet';
while (<$ifh>) {
  chomp;
  next if (!m/$which_plugins/);

  if (m/value="([^"]+)"/) {
    $mylist = $1;
    $mylist =~ s/default:(false|default),?//g;
    @plugins = split '@', $mylist;
    print join("\n", sort @plugins), "\n";
  }
}
