<?xml version="1.0" encoding="utf-8"?>
<!-- edited with XMLSpy v2007 sp1 (http://www.altova.com) by  () -->
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:variable name="rootTable"
			select="externalNode/mapperTable" />
		<xsl:variable name="subRootTable"
			select="externalNode/mapperTable/rootTable/table" />
		<br />
		<xsl:variable name="componentPreviewPic"
			select="$rootTable/@preview">
		</xsl:variable>
		<xsl:if test="string-length($componentPreviewPic)!=0">
			<div class="FONTSTYLE" align="left">
				<img src="{$componentPreviewPic}" usemap="#jobmap"
					alt="No image available" class="bordercolor" />
			</div>
		</xsl:if>
		<xsl:for-each select="$rootTable">
			<b class="FONTSTYLE">
				<xsl:value-of select="/externalNode/@i18n.mapper.table.for" />
				<xsl:value-of select="/externalNode/@name" />
				(
				<xsl:value-of select="@type" />
				):
			</b>
			<br />
			<br />
			<xsl:for-each select="table">
				<table border="0" width="96%" cellpadding="0"
					cellspacing="0" summary="">
					<tr>
						<td width="15"></td>
						<td>
							<b class="FONTSTYLE">
								<xsl:value-of select="/externalNode/@i18n.mapper.table.properties" />
								(
								<xsl:value-of select="@name" />
								):
							</b>
							<table class="cols" border="1" width="90%"
								cellpadding="0" cellspacing="0"
								style="border-collapse: collapse; padding-left:10mm;" bordercolor="#111111"
								frame="box" summary="">
								<tr>
									<th align="left" width="30%"
										class="TABLECOLUMNSTYLE">
										<xsl:value-of select="/externalNode/@i18n.job.properties" />
									</th>
									<th align="left"
										class="TABLECOLUMNSTYLE">
										<xsl:value-of select="/externalNode/@i18n.job.values" />
									</th>
								</tr>
								<tr>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of select="/externalNode/@i18n.job.name" />
									</td>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of select="@name" />
									</td>
								</tr>
								<tr>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.name" />
									</td>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of
											select="@tableName" />
									</td>
								</tr>
								<tr>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.alias" />
									</td>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of select="@alias" />
									</td>
								</tr>
								<tr>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.join.type" />
									</td>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of
											select="@joinType" />
									</td>
								</tr>

								<tr>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.isminimized" />
									</td>
									<td class="FONTSTYLE"
										align="left">
										<xsl:value-of
											select="@isMinimized" />
									</td>
								</tr>
							</table>
							<br />
							<br />
							<b class="FONTSTYLE">
								<xsl:value-of select="/externalNode/@i18n.mapper.table.metadata.entries" />(
								<xsl:value-of select="@name" />
								):
							</b>
							<br />
							<table class="cols" width="90%"
								cellpadding="0" border="1" cellspacing="0"
								style="border-collapse: collapse" bordercolor="#111111"
								frame="box" summary="">
								<tr class="profont">
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.job.name" />
									</th>
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.expression" />
									</th>
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.operator" />
									</th>
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.isJoin" />
									</th>
								</tr>
								<xsl:for-each
									select="metadataTableEntries/entry">
									<tr class="FONTSTYLE">
										<td align="left">
											<xsl:value-of
												select="@name" />
										</td>
										<td align="left">
											<xsl:value-of
												select="@expression" />
										</td>
										<td align="left">
											<xsl:value-of
												select="@operator" />
										</td>
										<td align="left">
											<xsl:value-of
												select="@isJoin" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
							<br />
							<b class="FONTSTYLE">
								<xsl:value-of select="/externalNode/@i18n.mapper.table.condition.entries" />(
								<xsl:value-of select="@name" />
								):
							</b>
							<table class="cols" width="90%"
								cellpadding="0" border="1" cellspacing="0"
								style="border-collapse: collapse" bordercolor="#111111"
								frame="box" summary="">
								<tr class="profont">
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.job.name" />
									</th>
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.expression" />
									</th>
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.operator" />
									</th>
									<th class="TABLECOLUMNSTYLE"
										width="25%">
										<xsl:value-of select="/externalNode/@i18n.mapper.table.isJoin" />
									</th>
								</tr>
								<xsl:for-each
									select="customConditionsEntries/entry">
									<tr class="FONTSTYLE">
										<td align="left">
											<xsl:value-of
												select="@name" />
										</td>
										<td align="left">
											<xsl:value-of
												select="@expression" />
										</td>
										<td align="left">
											<xsl:value-of
												select="@operator" />
										</td>
										<td align="left">
											<xsl:value-of
												select="@isJoin" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<br />
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>
